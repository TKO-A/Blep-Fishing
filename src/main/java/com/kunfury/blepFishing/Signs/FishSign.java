package com.kunfury.blepFishing.Signs;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.Plugin;

import com.kunfury.blepFishing.Setup;

import com.kunfury.blepFishing.Miscellaneous.FishEconomy;
import com.kunfury.blepFishing.Miscellaneous.Variables;
import com.kunfury.blepFishing.Objects.BaseFishObject;
import com.kunfury.blepFishing.Objects.MarketObject;

import org.bukkit.block.BlockState;
import org.bukkit.block.Sign;


public class FishSign implements Listener {
	
	public static List<SignObject> rankSigns = new ArrayList<>();
	public static List<MarketObject> marketSigns = new ArrayList<>();
	static String signFilePath = Setup.dataFolder + "/signs.data";
	static String marketFilePath = Setup.dataFolder + "/markets.data";   
	public static List<Location> signLocs = new ArrayList<>();

	private boolean fishExists;
	DecimalFormat df = new DecimalFormat("#.##");

	/**
	 * Signs for the Fishmarket
	 * @param e event variable
	 */
	@EventHandler
	public void onChange(SignChangeEvent e){
		String[] lines = e.getLines();
		Player player = e.getPlayer();
		
		//Beginning of new sign creation
		if(lines[0].equals("[bf]")) { //Checks that the sign is a Blep Fishing sign			
			if(lines[1].equalsIgnoreCase("Fish Market")) {
				if(player.hasPermission("bf.admin")) MarketCreate((Sign)e.getBlock().getState(), player.getWorld());
				else player.sendMessage(Variables.Prefix + "You need to be an admin to do that.");
			}else {
				//Checks if fish exist in the main list in FishSwitch
				if(!e.getLine(1).equalsIgnoreCase("ALL")){
					for(BaseFishObject fish : Variables.BaseFishList) {
						if(fish.Name.equalsIgnoreCase(e.getLine(1))) {
							fishExists = true;
							break;
						}
					}
				}else fishExists = true;

				//Only runs the code if the fish type exists
				if(fishExists){
					int level = 0;
					if(!lines[2].isEmpty()) { //Gets the provided leaderboard level
						try {
							level = Integer.parseInt(lines[2]) - 1;
							if(level <= 0)
								level = 0;
						}catch(Exception ex) {
							player.sendMessage("Third line is not a number, defaulting to 1st place.");
							level = 0;
						}
					}
					LeaderboardCreate((Sign)e.getBlock().getState(), level, lines[1], player.getWorld());
				}else e.setLine(3, ChatColor.translateAlternateColorCodes('&',"&4Fish Doesn't Exist"));


			}
		}
		
		
	}

	/**
	 * Updates the sign
	 */
	public void UpdateSigns() {
		for (SignObject signObj : rankSigns) {
			if(signObj.GetSign() != null) {
				RefreshSign.Refresh(signObj);
			}				
		}
	}

	/**
	 * Loads all the signs from the tempfile
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	@SuppressWarnings("unchecked")
	public void LoadSigns() {
        //Load Leaderboard Signs
        try 
        {
        	rankSigns.clear();
        	ObjectInputStream input = null;
		    File tempFile = new File(signFilePath);
		    if(tempFile.exists()) {
    		    input = new ObjectInputStream(new FileInputStream (signFilePath));
    		    rankSigns = (List<SignObject>)input.readObject();
		    }
		    if(input != null)
		    	input.close();
		} catch (IOException | ClassNotFoundException ex) {
			ex.printStackTrace();
		}
        //
        //Load Market Signs
        //
        try 
        {
        	marketSigns.clear();
        	ObjectInputStream input = null;
		    File tempFile = new File(marketFilePath);
		    if(tempFile.exists()) {
    		    input = new ObjectInputStream(new FileInputStream (marketFilePath));
    		    marketSigns = (List<MarketObject>)input.readObject();
		    }
		    if(input != null)
		    	input.close();
        } catch (IOException | ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Creates a Leaderboard on a Sign
	 * @param sign the sign to create the leaderboard on
	 * @param level the place the fish would be on the leaderboard
	 * @param fishName the fish name to create the leaderboard for
	 * @param world the world the leaderboard got created in
	 */
	private void LeaderboardCreate(Sign sign, int level, String fishName, World world) {
		
		rankSigns.add(new SignObject(sign, fishName, level, world));
		
		 //Save Fish
		try {
		    ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(signFilePath));
		    output.writeObject(rankSigns);
		    output.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		Bukkit.getScheduler().runTaskLater((Plugin) Setup.getPlugin(), new Runnable() {
			  @Override
			  public void run() {
				  UpdateSigns();
			  }
			}, 1L);
	}
	
	private void MarketCreate(Sign sign, World world) {
		
		marketSigns.add(new MarketObject(sign, world));
		
		 //Save Fish
		try {
		    ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(marketFilePath));
		    output.writeObject(marketSigns);
		    output.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		Bukkit.getScheduler().runTaskLater((Plugin) Setup.getPlugin(), new Runnable() {
			  @Override
			  public void run() {
				  	sign.setLine(0, "-------------");
	    			sign.setLine(1, "Fish");
	    			sign.setLine(2, "Market");
	    			sign.setLine(3, "-------------");
	    			sign.update();
	    			UpdateSigns();
			  }
			}, 1L);
	}

	/**
	 * Triggers when a Sign gets broken
	 * @param e event variable
	 * @throws Exception
	 */
	@EventHandler
	public void onSignBreak(BlockBreakEvent e) {
		
		BlockState bs = e.getBlock().getState();
		
		if(bs instanceof org.bukkit.block.Sign) { //Checks if the block is a sign
			if(rankSigns != null && rankSigns.size() > 0) {
				Sign bSign = (Sign)e.getBlock().getState();
				//The foreach loop is erroring
				try {
					for (SignObject signObj : rankSigns) {
						try {
							if(signObj.GetSign().equals(bSign)) {
								rankSigns.remove(signObj);
								break;
							}
						}catch(Exception ex) {
							rankSigns.remove(signObj);
						}
					}
				}
				catch(Exception ex) {
					//This is just needed because for some reason the sign list has an error sign in it
				}
				
			}
			if(marketSigns != null && marketSigns.size() > 0) {
				Sign bSign = (Sign)e.getBlock().getState();
				//The foreach loop is erroring
				try {
					for (MarketObject marketObj : marketSigns) {
						try {
							if(marketObj.GetSign().equals(bSign)) {
								marketSigns.remove(marketObj);
								break;
							}
						}catch(Exception ex) {
							marketSigns.remove(marketObj);
						}
					}
				}
				catch(Exception ex) {
					//This is just needed because for some reason the sign list has an error sign in it
				}
			}
			
		}
	}

	/**
	 * Triggers when a sign gets rightclickked
	 * @param e event variable
	 */
	@EventHandler
	public void onUseEvent(PlayerInteractEvent e) {
		if(e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {			
			BlockState bs = e.getClickedBlock().getState();		
			
			if(Setup.hasEcon && bs instanceof org.bukkit.block.Sign && e.getItem() != null  && e.getItem().getType() == Material.SALMON){
				
				for(MarketObject market : marketSigns) {
					if(market.CheckBool((Sign)bs)){
					    FishEconomy.SellFish(e.getPlayer(), 1);
						break;
					}
				}
			}
		}
		
	}
}
