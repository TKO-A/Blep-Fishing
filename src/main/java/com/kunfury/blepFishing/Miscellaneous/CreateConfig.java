package com.kunfury.blepFishing.Miscellaneous;

import java.util.Arrays;
import java.util.List;

import org.bukkit.configuration.file.FileConfiguration;

import com.kunfury.blepFishing.Setup;

public class CreateConfig {
	
    public CreateConfig() {    	
    	FileConfiguration config = Setup.config;
    	
    	config.set("Show ScoreBoard", true);
		config.set("Show Chat", false);
    	config.set("Currency Symbol", "$");
    	config.set("Allow Wandering Traders", false);
    	config.set("Wandering Traders Modifier", 1.50);
		config.set("Language Symbol", "en");
		config.set("Chat Prefix", "&b[BF]&f ");
		config.set("High Priority", false);
		config.set("Tournament Only", false);
		config.set("Area Permissions", false);
		//config.set("","");
		config.set("World Whitelist", false);
		List<String> worldWhitelist = Arrays.asList("WORLD", "WORLD_THE_END", "WORLD_NETHER");
		config.set("Allowed Worlds", worldWhitelist);
    	//Bluegill Create
    	config.set("fish.Bluegill.Lore", "Does it call me Pink Lung?");
    	config.set("fish.Bluegill.Min Size", 5);
    	config.set("fish.Bluegill.Max Size", 15);
    	config.set("fish.Bluegill.ModelData", 1);
    	config.set("fish.Bluegill.Base Price", 10);
    	config.set("fish.Bluegill.Area", "Temperate");
    	//Brown Trout Create
    	config.set("fish.Brown Trout.Lore", "Looks more beige to me.");
    	config.set("fish.Brown Trout.Min Size", 15);
    	config.set("fish.Brown Trout.Max Size", 39);
    	config.set("fish.Brown Trout.ModelData", 2);
    	config.set("fish.Brown Trout.Base Price", 10);
    	config.set("fish.Brown Trout.Area", "Temperate");
    	config.set("fish.Brown Trout.Raining", true);
    	//Carp Create
    	config.set("fish.Carp.Lore", "Looks more beige to me.");
    	config.set("fish.Carp.Min Size", 15);
    	config.set("fish.Carp.Max Size", 39);
    	config.set("fish.Carp.ModelData", 3);
    	config.set("fish.Carp.Base Price", 10);
    	config.set("fish.Carp.Area", "Temperate");
    	//Catfish Create
    	config.set("fish.Catfish.Lore", "I prefer a Dogfish.");
    	config.set("fish.Catfish.Min Size", 45);
    	config.set("fish.Catfish.Max Size", 65);
    	config.set("fish.Catfish.ModelData", 4);
    	config.set("fish.Catfish.Base Price", 10);
    	config.set("fish.Catfish.Area", "Temperate");
    	//Gar Create
    	config.set("fish.Gar.Lore", "Looks more beige to me.");
    	config.set("fish.Gar.Min Size", 15);
    	config.set("fish.Gar.Max Size", 39);
    	config.set("fish.Gar.ModelData", 5);
    	config.set("fish.Gar.Base Price", 10);
    	config.set("fish.Gar.Area", "Temperate");
    	//Minnow Create
    	config.set("fish.Minnow.Lore", "Looks more beige to me.");
    	config.set("fish.Minnow.Min Size", 15);
    	config.set("fish.Minnow.Max Size", 39);
    	config.set("fish.Minnow.ModelData", 6);
    	config.set("fish.Minnow.Base Price", 10);
    	config.set("fish.Minnow.Area", "Temperate");
    	//Muskeullunge Create
    	config.set("fish.Muskeullunge.Lore", "Don�t listen to them, I think you�re fin-tastic!");
    	config.set("fish.Muskeullunge.Min Size", 35);
    	config.set("fish.Muskeullunge.Max Size", 70);
    	config.set("fish.Muskeullunge.ModelData", 7);
    	config.set("fish.Muskeullunge.Base Price", 10);
    	config.set("fish.Muskeullunge.Area", "Temperate");
    	//Perch Create
    	config.set("fish.Perch.Lore", "Looks more beige to me.");
    	config.set("fish.Perch.Min Size", 15);
    	config.set("fish.Perch.Max Size", 39);
    	config.set("fish.Perch.ModelData", 8);
    	config.set("fish.Perch.Base Price", 10);
    	config.set("fish.Perch.Area", "Temperate");
    	//Smallmouth Bass Create
    	config.set("fish.Smallmouth Bass.Lore", "Looks more beige to me.");
    	config.set("fish.Smallmouth Bass.Min Size", 15);
    	config.set("fish.Smallmouth Bass.Max Size", 39);
    	config.set("fish.Smallmouth Bass.ModelData", 9);
    	config.set("fish.Smallmouth Bass.Base Price", 10);
    	config.set("fish.Smallmouth Bass.Area", "Temperate");
    	
    	////Cold
    	//Blackfish Create
    	config.set("fish.Blackfish.Lore", "Looks more beige to me.");
    	config.set("fish.Blackfish.Min Size", 15);
    	config.set("fish.Blackfish.Max Size", 39);
    	config.set("fish.Blackfish.ModelData", 10);
    	config.set("fish.Blackfish.Base Price", 10);
    	config.set("fish.Blackfish.Area", "Cold");
    	//Cod Create
    	config.set("fish.Cod.Lore", "Cod you pass me the salt?");
    	config.set("fish.Cod.Min Size", 15);
    	config.set("fish.Cod.Max Size", 39);
    	config.set("fish.Cod.ModelData", 11);
    	config.set("fish.Cod.Base Price", 10);
    	config.set("fish.Cod.Area", "Cold");
    	//Halibut Create
    	config.set("fish.Halibut.Lore", "Ahh, let�s do it just for the halibut!");
    	config.set("fish.Halibut.Min Size", 15);
    	config.set("fish.Halibut.Max Size", 39);
    	config.set("fish.Halibut.ModelData", 12);
    	config.set("fish.Halibut.Base Price", 10);
    	config.set("fish.Halibut.Area", "Cold");
    	//Herring Create
    	config.set("fish.Herring.Lore", "Now to find a red one...");
    	config.set("fish.Herring.Min Size", 15);
    	config.set("fish.Herring.Max Size", 39);
    	config.set("fish.Herring.ModelData", 13);
    	config.set("fish.Herring.Base Price", 10);
    	config.set("fish.Herring.Area", "Cold");
    	//Pink Salmon Create
    	config.set("fish.Pink Salmon.Lore", "Salmon had to say it.");
    	config.set("fish.Pink Salmon.Min Size", 15);
    	config.set("fish.Pink Salmon.Max Size", 39);
    	config.set("fish.Pink Salmon.ModelData", 14);
    	config.set("fish.Pink Salmon.Base Price", 10);
    	config.set("fish.Pink Salmon.Area", "Cold");
    	//Pollock Create
    	config.set("fish.Pollock.Lore", "What a load of Pollocks.");
    	config.set("fish.Pollock.Min Size", 15);
    	config.set("fish.Pollock.Max Size", 39);
    	config.set("fish.Pollock.ModelData", 15);
    	config.set("fish.Pollock.Base Price", 10);
    	config.set("fish.Pollock.Area", "Cold");
    	//Rainbow Trout Create
    	config.set("fish.Rainbow Trout.Lore", "Any fin is possible, just don�t trout yourself!");
    	config.set("fish.Rainbow Trout.Min Size", 15);
    	config.set("fish.Rainbow Trout.Max Size", 39);
    	config.set("fish.Rainbow Trout.ModelData", 16);
    	config.set("fish.Rainbow Trout.Base Price", 10);
    	config.set("fish.Rainbow Trout.Area", "Cold");
    	
    	////Ocean
    	//Red Grouper Create
    	config.set("fish.Red Grouper.Lore", "I'm green with envy.");
    	config.set("fish.Red Grouper.Min Size", 15);
    	config.set("fish.Red Grouper.Max Size", 39);
    	config.set("fish.Red Grouper.ModelData", 17);
    	config.set("fish.Red Grouper.Base Price", 10);
    	config.set("fish.Red Grouper.Area", "Ocean");
    	//Tuna Create
    	config.set("fish.Tuna.Lore", "Hmm... Tastes like chicken!");
    	config.set("fish.Tuna.Min Size", 15);
    	config.set("fish.Tuna.Max Size", 39);
    	config.set("fish.Tuna.ModelData", 18);
    	config.set("fish.Tuna.Base Price", 10);
    	config.set("fish.Tuna.Area", "Ocean");
		//Anglerfish Create
		config.set("fish.Anglerfish.Lore", "I'm gonna get you! I'm gonna get you!");
		config.set("fish.Anglerfish.Min Size", 10);
		config.set("fish.Anglerfish.Max Size", 46);
		config.set("fish.Anglerfish.ModelData", 23);
		config.set("fish.Anglerfish.Base Price", 10);
		config.set("fish.Anglerfish.Area", "Ocean");
		config.set("fish.Anglerfish.Min Height", -256);
		config.set("fish.Anglerfish.Max Height", 15);

    	//Ocean
    	
    	////Dry
    	//Bayad Create
    	config.set("fish.Bayad.Lore", "I�m hooked!");
    	config.set("fish.Bayad.Min Size", 15);
    	config.set("fish.Bayad.Max Size", 40);
    	config.set("fish.Bayad.ModelData", 19);
    	config.set("fish.Bayad.Base Price", 10);
    	config.set("fish.Bayad.Area", "Dry");
    	//Boulti Create
    	config.set("fish.Boulti.Lore", "I think you�re fintastic.");
    	config.set("fish.Boulti.Min Size", 15);
    	config.set("fish.Boulti.Max Size", 39);
    	config.set("fish.Boulti.ModelData", 20);
    	config.set("fish.Boulti.Base Price", 10);
    	config.set("fish.Boulti.Area", "Dry");
    	//Capitaine Create
    	config.set("fish.Capitaine.Lore", "Not quite up to scale.");
    	config.set("fish.Capitaine.Min Size", 15);
    	config.set("fish.Capitaine.Max Size", 39);
    	config.set("fish.Capitaine.ModelData", 21);
    	config.set("fish.Capitaine.Base Price", 10);
    	config.set("fish.Capitaine.Area", "Dry");
    	//Synodontis Create
    	config.set("fish.Synodontis.Lore", "Full of Fishcious rumors.");
    	config.set("fish.Synodontis.Min Size", 15);
    	config.set("fish.Synodontis.Max Size", 39);
    	config.set("fish.Synodontis.ModelData", 22);
    	config.set("fish.Synodontis.Base Price", 10);
    	config.set("fish.Synodontis.Area", "Dry");



    	
    	////
    	//Rarities
    	////
    	
    	//Legendary Rarity Create
    	config.set("rarities.Legendary.Weight", 5);
    	config.set("rarities.Legendary.Color Code", 6);
    	config.set("rarities.Legendary.Price Mod", 10);
    	//Epic Rarity Create
    	config.set("rarities.Epic.Weight", 30);
    	config.set("rarities.Epic.Color Code", 'd');
    	config.set("rarities.Epic.Price Mod", 5);
    	//Rare Rarity Create
    	config.set("rarities.Rare.Weight", 60);
    	config.set("rarities.Rare.Color Code", 'b');
    	config.set("rarities.Rare.Price Mod", 2.5);
    	//Common Rarity Create
    	config.set("rarities.Common.Weight", 100);
    	config.set("rarities.Common.Color Code", 'a');
    	config.set("rarities.Common.Price Mod", 1);
    	
    	/////
    	//Areas
    	////
    	List<String> bCold = Arrays.asList("MOUNTAINS", "GRAVELLY_MOUNTAINS", "WOODED_MOUNTAINS",
				"TAIGA", "TAIGA_MOUNTAINS", "GIANT_TREE_TAIGA", "GIANT_SPRUCE_TAIGA", "STONE_SHORE",
				"SNOWY_TUNDRA", "ICE_SPIKES", "SNOWY_TAIGA", "SNOWY_TAIGA_MOUNTAINS",
				"FROZEN_RIVER", "SNOWY_BEACH");
    	List<String> bTemperate = Arrays.asList("PLAINS", "SUNFLOWER_PLAINS", "FOREST", "FOREST",
				"FLOWER_FOREST", "BIRCH_FOREST", "TALL_BIRCH_FOREST", "DARK_FOREST", "DARK_FOREST_HILLS",
				"JUNGLE", "MODIFIED_JUNGLE", "JUNGLE_EDGE", "MODIFIED_JUNGLE_EDGE", "BAMBOO_JUNGLE",
				"RIVER", "BEACH", "MUSHROOM_FIELDS", "MUSHROOM_FIELD_SHORE");
    	List<String> bEnd = Arrays.asList("THE_END", "SMALL_END_ISLANDS", "END_MIDLANDS",
				"END_HIGHLANDS", "END_BARRENS");
    	List<String> bDry = Arrays.asList("DESERT", "DESERT_LAKES", "DESERT_HILLS" ,"SAVANNA", "SHATTERED_SAVANNA",
				"BADLANDS", "ERODED_BADLANDS", "WOODED_BADLANDS_PLATEAU", "MODIFIED_WOODED_BADLANDS_PLATEAU");
    	List<String> bNether = Arrays.asList("NETHER_WASTES", "SOUL_SAND_VALLEY", "CRIMSON_FOREST",
				"WARPED_FOREST", "BASALT_DELTAS");
    	List<String> bOcean = Arrays.asList("WARM_OCEAN", "LUKEWARM_OCEAN", "DEEP_LUKEWARM_OCEAN",
				"OCEAN", "DEEP_OCEAN", "COLD_OCEAN", "DEEP_COLD_OCEAN", "FROZEN_OCEAN", "DEEP_FROZEN_OCEAN");
    	
    	config.set("areas.Cold.Biomes", bCold);
    	config.set("areas.Temperate.Biomes", bTemperate);
    	config.set("areas.End.Biomes", bEnd);
    	config.set("areas.Dry.Biomes", bDry);
    	config.set("areas.Nether.Biomes", bNether);
    	config.set("areas.Ocean.Biomes", bOcean);
    }

}
