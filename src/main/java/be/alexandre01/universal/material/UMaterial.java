package be.alexandre01.universal.material;

import be.alexandre01.universal.material.modern.ModernMaterial;
import org.bukkit.Material;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class UMaterial  {
    public static final ModernMaterial modern = new ModernMaterial();

    public static final UItemData AIR = new UItemData("air", "air");
    public static final UItemData GRASS_BLOCK = new UItemData("grass_block", "grass_block");
    public static final UItemData DIRT = new UItemData("dirt", "dirt");
    public static final UItemData COARSE_DIRT = new UItemData(new UItemData.LegacyCompactedData("dirt", (byte) 1), "coarse_dirt");
    public static final UItemData PODZOL = new UItemData(new UItemData.LegacyCompactedData("dirt", (byte) 2), "podzol");
    public static final UItemData COBBLESTONE = new UItemData("cobblestone", "cobblestone");
    public static final UItemData BEDROCK = new UItemData("bedrock", "bedrock");
    public static final UItemData WATER = new UItemData("water", "water");
    public static final UItemData LAVA = new UItemData("lava", "lava");
    public static final UItemData GRAVEL = new UItemData("gravel", "gravel");
    public static final UItemData GOLD_ORE = new UItemData("gold_ore", "gold_ore");
    public static final UItemData IRON_ORE = new UItemData("iron_ore", "iron_ore");
    public static final UItemData COAL_ORE = new UItemData("coal_ore", "coal_ore");
    //public static final UItemData CUT_SANDSTONE = new UItemData(new UItemData.LegacyCompactedData("sandstone",(byte) 2),"cut_sandstone");
    public static final UItemData SPONGE = new UItemData("sponge", "sponge");
    public static final UItemData WET_SPONGE = new UItemData(new UItemData.LegacyCompactedData("sponge", (byte) 1), "wet_sponge");
    public static final UItemData GLASS = new UItemData("glass", "glass");
    //public static final UItemData TINTED_GLASS = new UItemData("stained_glass","tinted_glass");
    public static final UItemData LAPIS_ORE = new UItemData("lapis_ore", "lapis_ore");
    public static final UItemData LAPIS_BLOCK = new UItemData("lapis_block", "lapis_block");
    public static final UItemData DISPENSER = new UItemData("dispenser", "dispenser");
    public static final UItemData SANDSTONE_SLAB = new UItemData(new UItemData.LegacyCompactedData("stone_slab", (byte) 1), "sandstone_slab");
    public static final UItemData SMOOTH_SANDSTONE_SLAB = new UItemData(new UItemData.LegacyCompactedData("stone_slab", (byte) 9), "smooth_sandstone_slab");
    public static final UItemData RED_SANDSTONE_SLAB = new UItemData(new UItemData.LegacyCompactedData("stone_slab", (byte) 2), "red_sandstone_slab");
    public static final UItemData SMOOTH_RED_SANDSTONE_SLAB = new UItemData(new UItemData.LegacyCompactedData("stone_slab", (byte) 10), "smooth_red_sandstone_slab");
    // public static final UItemData PETRIFIED_OAK_SLAB = new UItemData(new UItemData.LegacyCompactedData("stone_slab",(byte) 3),"petrified_oak_slab");
    public static final UItemData BROWN_MUSHROOM = new UItemData("brown_mushroom", "brown_mushroom");
    public static final UItemData SANDSTONE_STAIRS = new UItemData("sandstone_stairs", "sandstone_stairs");
    public static final UItemData FIRE = new UItemData("fire", "fire");
    public static final UItemData TRAPPED_CHEST = new UItemData("trapped_chest", "trapped_chest");
    public static final UItemData QUARTZ_STAIRS = new UItemData("quartz_stairs", "quartz_stairs");
    public static final UItemData STONE_BRICK_STAIRS = new UItemData("stone_brick_stairs", "stone_brick_stairs");
    public static final UItemData MELON_STEM = new UItemData("melon_stem", "melon_stem");
    public static final UItemData BREWING_STAND = new UItemData("brewing_stand", "brewing_stand");
    public static final UItemData REDSTONE_TORCH = new UItemData("redstone_torch", "redstone_torch");
    public static final UItemData CACTUS = new UItemData("cactus", "cactus");
    public static final UItemData STICKY_PISTON = new UItemData("sticky_piston", "sticky_piston");
    public static final UItemData CAKE = new UItemData("cake", "cake");
    public static final UItemData SPRUCE_DOOR = new UItemData("spruce_door", "spruce_door");
    public static final UItemData PUMPKIN = new UItemData("pumpkin", "pumpkin");
    public static final UItemData COBBLESTONE_WALL = new UItemData("cobblestone_wall", "cobblestone_wall");
    public static final UItemData WHEAT = new UItemData("wheat", "wheat");
    public static final UItemData RED_MUSHROOM = new UItemData("red_mushroom", "red_mushroom");
    public static final UItemData DROPPER = new UItemData("dropper", "dropper");
    public static final UItemData BROWN_MUSHROOM_BLOCK = new UItemData("brown_mushroom_block", "brown_mushroom_block");
    public static final UItemData OAK_STAIRS = new UItemData("oak_stairs", "oak_stairs");
    public static final UItemData IRON_TRAPDOOR = new UItemData("iron_trapdoor", "iron_trapdoor");
    public static final UItemData REDSTONE_ORE = new UItemData("redstone_ore", "redstone_ore");
    public static final UItemData EMERALD_ORE = new UItemData("emerald_ore", "emerald_ore");
    public static final UItemData COMMAND_BLOCK = new UItemData("command_block", "command_block");
    public static final UItemData EMERALD_BLOCK = new UItemData("emerald_block", "emerald_block");
    public static final UItemData CRAFTING_TABLE = new UItemData("crafting_table", "crafting_table");
    public static final UItemData ICE = new UItemData("ice", "ice");
    public static final UItemData SPRUCE_STAIRS = new UItemData("spruce_stairs", "spruce_stairs");
    public static final UItemData JUKEBOX = new UItemData("jukebox", "jukebox");
    public static final UItemData CLAY = new UItemData("clay", "clay");
    public static final UItemData RED_SANDSTONE_STAIRS = new UItemData("red_sandstone_stairs", "red_sandstone_stairs");
    public static final UItemData GOLD_BLOCK = new UItemData("gold_block", "gold_block");
    public static final UItemData DARK_OAK_FENCE_GATE = new UItemData("dark_oak_fence_gate", "dark_oak_fence_gate");
    public static final UItemData ACACIA_FENCE_GATE = new UItemData("acacia_fence_gate","acacia_fence_gate");
    public static final UItemData BRICK_STAIRS = new UItemData("brick_stairs", "brick_stairs");
    public static final UItemData END_PORTAL = new UItemData("end_portal", "end_portal");
    public static final UItemData HEAVY_WEIGHTED_PRESSURE_PLATE = new UItemData("heavy_weighted_pressure_plate", "heavy_weighted_pressure_plate");
    public static final UItemData BIRCH_FENCE_GATE = new UItemData("birch_fence_gate", "birch_fence_gate");
    public static final UItemData NETHER_WART = new UItemData("nether_wart", "nether_wart");
    public static final UItemData ACACIA_DOOR = new UItemData("acacia_door","acacia_door");
    public static final UItemData DARK_OAK_STAIRS = new UItemData("dark_oak_stairs", "dark_oak_stairs");
    public static final UItemData HAY_BLOCK = new UItemData("hay_block", "hay_block");
    public static final UItemData COCOA = new UItemData("cocoa", "cocoa");
    public static final UItemData DETECTOR_RAIL = new UItemData("detector_rail", "detector_rail");
    public static final UItemData DIAMOND_BLOCK = new UItemData("diamond_block", "diamond_block");
    public static final UItemData SPRUCE_FENCE_GATE = new UItemData("spruce_fence_gate", "spruce_fence_gate");
    public static final UItemData END_STONE = new UItemData("end_stone", "end_stone");
    public static final UItemData BEACON = new UItemData("beacon", "beacon");
    public static final UItemData SEA_LANTERN = new UItemData("sea_lantern", "sea_lantern");
    public static final UItemData REDSTONE_WIRE = new UItemData("redstone_wire", "redstone_wire");
    public static final UItemData NETHER_BRICK_STAIRS = new UItemData("nether_brick_stairs", "nether_brick_stairs");
    public static final UItemData GLOWSTONE = new UItemData("glowstone", "glowstone");
    public static final UItemData CARROTS = new UItemData("carrots", "carrots");
    public static final UItemData GLASS_PANE = new UItemData("glass_pane", "glass_pane");
    public static final UItemData TRIPWIRE = new UItemData("tripwire", "tripwire");
    public static final UItemData DIAMOND_ORE = new UItemData("diamond_ore", "diamond_ore");
    public static final UItemData BIRCH_DOOR = new UItemData("birch_door", "birch_door");
    public static final UItemData NETHERRACK = new UItemData("netherrack", "netherrack");
    public static final UItemData IRON_BARS = new UItemData("iron_bars", "iron_bars");
    public static final UItemData DRAGON_EGG = new UItemData("dragon_egg", "dragon_egg");
    public static final UItemData ANVIL = new UItemData("anvil", "anvil");
    public static final UItemData PISTON_HEAD = new UItemData("piston_head", "piston_head");
    public static final UItemData TORCH = new UItemData("torch", "torch");
    public static final UItemData ENDER_CHEST = new UItemData("ender_chest", "ender_chest");
    public static final UItemData TNT = new UItemData("tnt", "tnt");
    public static final UItemData BOOKSHELF = new UItemData("bookshelf", "bookshelf");
    public static final UItemData ENCHANTING_TABLE = new UItemData("enchanting_table", "enchanting_table");
    public static final UItemData LEVER = new UItemData("lever", "lever");
    public static final UItemData STONE_PRESSURE_PLATE = new UItemData("stone_pressure_plate", "stone_pressure_plate");
    public static final UItemData CHEST = new UItemData("chest", "chest");
    public static final UItemData SPRUCE_FENCE = new UItemData("spruce_fence", "spruce_fence");
    public static final UItemData BIRCH_FENCE = new UItemData("birch_fence", "birch_fence");
    public static final UItemData BIRCH_STAIRS = new UItemData("birch_stairs", "birch_stairs");
    public static final UItemData DARK_OAK_DOOR = new UItemData("dark_oak_door", "dark_oak_door");
    public static final UItemData LADDER = new UItemData("ladder", "ladder");
    public static final UItemData RED_MUSHROOM_BLOCK = new UItemData("red_mushroom_block", "red_mushroom_block");
    public static final UItemData IRON_BLOCK = new UItemData("iron_block", "iron_block");
    public static final UItemData REDSTONE_LAMP = new UItemData("redstone_lamp", "redstone_lamp");
    public static final UItemData SOUL_SAND = new UItemData("soul_sand", "soul_sand");
    public static final UItemData PUMPKIN_STEM = new UItemData("pumpkin_stem", "pumpkin_stem");
    public static final UItemData BARRIER = new UItemData("barrier", "barrier");
    public static final UItemData POTATOES = new UItemData("potatoes", "potatoes");
    public static final UItemData HOPPER = new UItemData("hopper", "hopper");
    public static final UItemData FARMLAND = new UItemData("farmland", "farmland");
    public static final UItemData LIGHT_WEIGHTED_PRESSURE_PLATE = new UItemData("light_weighted_pressure_plate", "light_weighted_pressure_plate");
    public static final UItemData TRIPWIRE_HOOK = new UItemData("tripwire_hook", "tripwire_hook");
    public static final UItemData COAL_BLOCK = new UItemData("coal_block", "coal_block");
    public static final UItemData PACKED_ICE = new UItemData("packed_ice", "packed_ice");
    public static final UItemData ACACIA_STAIRS = new UItemData("acacia_stairs","acacia_stairs");
    public static final UItemData VINE = new UItemData("vine", "vine");
    public static final UItemData FURNACE = new UItemData("furnace", "furnace");
    public static final UItemData REDSTONE_BLOCK = new UItemData("redstone_block", "redstone_block");
    public static final UItemData GRASS = new UItemData("grass", "grass");
    public static final UItemData QUARTZ_BLOCK = new UItemData("quartz_block", "quartz_block");
    public static final UItemData SNOW = new UItemData("snow", "snow");
    public static final UItemData ACACIA_FENCE = new UItemData("acacia_fence","acacia_fence");
    public static final UItemData DARK_OAK_FENCE = new UItemData("dark_oak_fence", "dark_oak_fence");
    public static final UItemData JUNGLE_FENCE = new UItemData("jungle_fence", "jungle_fence");
    public static final UItemData MOSSY_COBBLESTONE = new UItemData("mossy_cobblestone", "mossy_cobblestone");
    public static final UItemData DAYLIGHT_DETECTOR = new UItemData("daylight_detector", "daylight_detector");
    public static final UItemData RAIL = new UItemData("rail", "rail");
    public static final UItemData JUNGLE_STAIRS = new UItemData("jungle_stairs", "jungle_stairs");
    public static final UItemData OBSIDIAN = new UItemData("obsidian", "obsidian");
    public static final UItemData WALL_SIGN = new UItemData("wall_sign", "wall_sign");
    public static final UItemData JUNGLE_DOOR = new UItemData("jungle_door", "jungle_door");
    public static final UItemData STONE_BUTTON = new UItemData("stone_button", "stone_button");
    public static final UItemData PISTON = new UItemData("piston", "piston");
    public static final UItemData END_PORTAL_FRAME = new UItemData("end_portal_frame", "end_portal_frame");
    public static final UItemData FLOWER_POT = new UItemData("flower_pot", "flower_pot");
    public static final UItemData IRON_DOOR = new UItemData("iron_door", "iron_door");
    public static final UItemData MYCELIUM = new UItemData("mycelium", "mycelium");

    public static final UItemData JUNGLE_FENCE_GATE = new UItemData("jungle_fence_gate", "jungle_fence_gate");
    public static final UItemData STONE_SLAB = new UItemData("stone_slab", "stone_slab");
    public static final UItemData ACTIVATOR_RAIL = new UItemData("activator_rail", "activator_rail");
    public static final UItemData NETHER_BRICK_FENCE = new UItemData("nether_brick_fence", "nether_brick_fence");

    // wools
    public static final USpecificItemData WHITE_WOOL = new USpecificItemData(new UItemData.LegacyCompactedData("wool", (byte) 0), "white_wool");
    public static final USpecificItemData ORANGE_WOOL = new USpecificItemData(new UItemData.LegacyCompactedData("wool", (byte) 1), "orange_wool");
    public static final USpecificItemData MAGENTA_WOOL = new USpecificItemData(new UItemData.LegacyCompactedData("wool", (byte) 2), "magenta_wool");
    public static final USpecificItemData LIGHT_BLUE_WOOL = new USpecificItemData(new UItemData.LegacyCompactedData("wool", (byte) 3), "light_blue_wool");
    public static final USpecificItemData YELLOW_WOOL = new USpecificItemData(new UItemData.LegacyCompactedData("wool", (byte) 4), "yellow_wool");
    public static final USpecificItemData LIME_WOOL = new USpecificItemData(new UItemData.LegacyCompactedData("wool", (byte) 5), "lime_wool");
    public static final USpecificItemData PINK_WOOL = new USpecificItemData(new UItemData.LegacyCompactedData("wool", (byte) 6), "pink_wool");
    public static final USpecificItemData GRAY_WOOL = new USpecificItemData(new UItemData.LegacyCompactedData("wool", (byte) 7), "gray_wool");
    public static final USpecificItemData LIGHT_GRAY_WOOL = new USpecificItemData(new UItemData.LegacyCompactedData("wool", (byte) 8), "light_gray_wool");
    public static final USpecificItemData CYAN_WOOL = new USpecificItemData(new UItemData.LegacyCompactedData("wool", (byte) 9), "cyan_wool");
    public static final USpecificItemData PURPLE_WOOL = new USpecificItemData(new UItemData.LegacyCompactedData("wool", (byte) 10), "purple_wool");
    public static final USpecificItemData BLUE_WOOL = new USpecificItemData(new UItemData.LegacyCompactedData("wool", (byte) 11), "blue_wool");
    public static final USpecificItemData BROWN_WOOL = new USpecificItemData(new UItemData.LegacyCompactedData("wool", (byte) 12), "brown_wool");
    public static final USpecificItemData GREEN_WOOL = new USpecificItemData(new UItemData.LegacyCompactedData("wool", (byte) 13), "green_wool");
    public static final USpecificItemData RED_WOOL = new USpecificItemData(new UItemData.LegacyCompactedData("wool", (byte) 14), "red_wool");
    public static final USpecificItemData BLACK_WOOL = new USpecificItemData(new UItemData.LegacyCompactedData("wool", (byte) 15), "black_wool");

    // carpets
    public static final USpecificItemData WHITE_CARPET = new USpecificItemData(new UItemData.LegacyCompactedData("carpet", (byte) 0), "white_carpet");
    public static final USpecificItemData ORANGE_CARPET = new USpecificItemData(new UItemData.LegacyCompactedData("carpet", (byte) 1), "orange_carpet");
    public static final USpecificItemData MAGENTA_CARPET = new USpecificItemData(new UItemData.LegacyCompactedData("carpet", (byte) 2), "magenta_carpet");
    public static final USpecificItemData LIGHT_BLUE_CARPET = new USpecificItemData(new UItemData.LegacyCompactedData("carpet", (byte) 3), "light_blue_carpet");
    public static final USpecificItemData YELLOW_CARPET = new USpecificItemData(new UItemData.LegacyCompactedData("carpet", (byte) 4), "yellow_carpet");
    public static final USpecificItemData LIME_CARPET = new USpecificItemData(new UItemData.LegacyCompactedData("carpet", (byte) 5), "lime_carpet");
    public static final USpecificItemData PINK_CARPET = new USpecificItemData(new UItemData.LegacyCompactedData("carpet", (byte) 6), "pink_carpet");
    public static final USpecificItemData GRAY_CARPET = new USpecificItemData(new UItemData.LegacyCompactedData("carpet", (byte) 7), "gray_carpet");
    public static final USpecificItemData LIGHT_GRAY_CARPET = new USpecificItemData(new UItemData.LegacyCompactedData("carpet", (byte) 8), "light_gray_carpet");
    public static final USpecificItemData CYAN_CARPET = new USpecificItemData(new UItemData.LegacyCompactedData("carpet", (byte) 9), "cyan_carpet");
    public static final USpecificItemData PURPLE_CARPET = new USpecificItemData(new UItemData.LegacyCompactedData("carpet", (byte) 10), "purple_carpet");
    public static final USpecificItemData BLUE_CARPET = new USpecificItemData(new UItemData.LegacyCompactedData("carpet", (byte) 11), "blue_carpet");
    public static final USpecificItemData BROWN_CARPET = new USpecificItemData(new UItemData.LegacyCompactedData("carpet", (byte) 12), "brown_carpet");
    public static final USpecificItemData GREEN_CARPET = new USpecificItemData(new UItemData.LegacyCompactedData("carpet", (byte) 13), "green_carpet");
    public static final USpecificItemData RED_CARPET = new USpecificItemData(new UItemData.LegacyCompactedData("carpet", (byte) 14), "red_carpet");
    public static final USpecificItemData BLACK_CARPET = new USpecificItemData(new UItemData.LegacyCompactedData("carpet", (byte) 15), "black_carpet");

    // stained glass
    public static final USpecificItemData WHITE_STAINED_GLASS = new USpecificItemData(new UItemData.LegacyCompactedData("stained_glass", (byte) 0), "white_stained_glass");
    public static final USpecificItemData ORANGE_STAINED_GLASS = new USpecificItemData(new UItemData.LegacyCompactedData("stained_glass", (byte) 1), "orange_stained_glass");
    public static final USpecificItemData MAGENTA_STAINED_GLASS = new USpecificItemData(new UItemData.LegacyCompactedData("stained_glass", (byte) 2), "magenta_stained_glass");
    public static final USpecificItemData LIGHT_BLUE_STAINED_GLASS = new USpecificItemData(new UItemData.LegacyCompactedData("stained_glass", (byte) 3), "light_blue_stained_glass");
    public static final USpecificItemData YELLOW_STAINED_GLASS = new USpecificItemData(new UItemData.LegacyCompactedData("stained_glass", (byte) 4), "yellow_stained_glass");
    public static final USpecificItemData LIME_STAINED_GLASS = new USpecificItemData(new UItemData.LegacyCompactedData("stained_glass", (byte) 5), "lime_stained_glass");
    public static final USpecificItemData PINK_STAINED_GLASS = new USpecificItemData(new UItemData.LegacyCompactedData("stained_glass", (byte) 6), "pink_stained_glass");
    public static final USpecificItemData GRAY_STAINED_GLASS = new USpecificItemData(new UItemData.LegacyCompactedData("stained_glass", (byte) 7), "gray_stained_glass");
    public static final USpecificItemData LIGHT_GRAY_STAINED_GLASS = new USpecificItemData(new UItemData.LegacyCompactedData("stained_glass", (byte) 8), "light_gray_stained_glass");
    public static final USpecificItemData CYAN_STAINED_GLASS = new USpecificItemData(new UItemData.LegacyCompactedData("stained_glass", (byte) 9), "cyan_stained_glass");
    public static final USpecificItemData PURPLE_STAINED_GLASS = new USpecificItemData(new UItemData.LegacyCompactedData("stained_glass", (byte) 10), "purple_stained_glass");
    public static final USpecificItemData BLUE_STAINED_GLASS = new USpecificItemData(new UItemData.LegacyCompactedData("stained_glass", (byte) 11), "blue_stained_glass");
    public static final USpecificItemData BROWN_STAINED_GLASS = new USpecificItemData(new UItemData.LegacyCompactedData("stained_glass", (byte) 12), "brown_stained_glass");
    public static final USpecificItemData GREEN_STAINED_GLASS = new USpecificItemData(new UItemData.LegacyCompactedData("stained_glass", (byte) 13), "green_stained_glass");
    public static final USpecificItemData RED_STAINED_GLASS = new USpecificItemData(new UItemData.LegacyCompactedData("stained_glass", (byte) 14), "red_stained_glass");
    public static final USpecificItemData BLACK_STAINED_GLASS = new USpecificItemData(new UItemData.LegacyCompactedData("stained_glass", (byte) 15), "black_stained_glass");

    // stained glass panes
    public static final USpecificItemData WHITE_STAINED_GLASS_PANE = new USpecificItemData(new UItemData.LegacyCompactedData("stained_glass_pane", (byte) 0), "white_stained_glass_pane");
    public static final USpecificItemData ORANGE_STAINED_GLASS_PANE = new USpecificItemData(new UItemData.LegacyCompactedData("stained_glass_pane", (byte) 1), "orange_stained_glass_pane");
    public static final USpecificItemData MAGENTA_STAINED_GLASS_PANE = new USpecificItemData(new UItemData.LegacyCompactedData("stained_glass_pane", (byte) 2), "magenta_stained_glass_pane");
    public static final USpecificItemData LIGHT_BLUE_STAINED_GLASS_PANE = new USpecificItemData(new UItemData.LegacyCompactedData("stained_glass_pane", (byte) 3), "light_blue_stained_glass_pane");
    public static final USpecificItemData YELLOW_STAINED_GLASS_PANE = new USpecificItemData(new UItemData.LegacyCompactedData("stained_glass_pane", (byte) 4), "yellow_stained_glass_pane");
    public static final USpecificItemData LIME_STAINED_GLASS_PANE = new USpecificItemData(new UItemData.LegacyCompactedData("stained_glass_pane", (byte) 5), "lime_stained_glass_pane");
    public static final USpecificItemData PINK_STAINED_GLASS_PANE = new USpecificItemData(new UItemData.LegacyCompactedData("stained_glass_pane", (byte) 6), "pink_stained_glass_pane");
    public static final USpecificItemData GRAY_STAINED_GLASS_PANE = new USpecificItemData(new UItemData.LegacyCompactedData("stained_glass_pane", (byte) 7), "gray_stained_glass_pane");
    public static final USpecificItemData LIGHT_GRAY_STAINED_GLASS_PANE = new USpecificItemData(new UItemData.LegacyCompactedData("stained_glass_pane", (byte) 8), "light_gray_stained_glass_pane");
    public static final USpecificItemData CYAN_STAINED_GLASS_PANE = new USpecificItemData(new UItemData.LegacyCompactedData("stained_glass_pane", (byte) 9), "cyan_stained_glass_pane");
    public static final USpecificItemData PURPLE_STAINED_GLASS_PANE = new USpecificItemData(new UItemData.LegacyCompactedData("stained_glass_pane", (byte) 10), "purple_stained_glass_pane");
    public static final USpecificItemData BLUE_STAINED_GLASS_PANE = new USpecificItemData(new UItemData.LegacyCompactedData("stained_glass_pane", (byte) 11), "blue_stained_glass_pane");
    public static final USpecificItemData BROWN_STAINED_GLASS_PANE = new USpecificItemData(new UItemData.LegacyCompactedData("stained_glass_pane", (byte) 12), "brown_stained_glass_pane");
    public static final USpecificItemData GREEN_STAINED_GLASS_PANE = new USpecificItemData(new UItemData.LegacyCompactedData("stained_glass_pane", (byte) 13), "green_stained_glass_pane");
    public static final USpecificItemData RED_STAINED_GLASS_PANE = new USpecificItemData(new UItemData.LegacyCompactedData("stained_glass_pane", (byte) 14), "red_stained_glass_pane");
    public static final USpecificItemData BLACK_STAINED_GLASS_PANE = new USpecificItemData(new UItemData.LegacyCompactedData("stained_glass_pane", (byte) 15), "black_stained_glass_pane");

    // clay
    public static final USpecificItemData WHITE_TERRACOTTA = new USpecificItemData(new UItemData.LegacyCompactedData("stained_hardened_clay", (byte) 0), "white_terracotta");
    public static final USpecificItemData ORANGE_TERRACOTTA = new USpecificItemData(new UItemData.LegacyCompactedData("stained_hardened_clay", (byte) 1), "orange_terracotta");
    public static final USpecificItemData MAGENTA_TERRACOTTA = new USpecificItemData(new UItemData.LegacyCompactedData("stained_hardened_clay", (byte) 2), "magenta_terracotta");
    public static final USpecificItemData LIGHT_BLUE_TERRACOTTA = new USpecificItemData(new UItemData.LegacyCompactedData("stained_hardened_clay", (byte) 3), "light_blue_terracotta");
    public static final USpecificItemData YELLOW_TERRACOTTA = new USpecificItemData(new UItemData.LegacyCompactedData("stained_hardened_clay", (byte) 4), "yellow_terracotta");
    public static final USpecificItemData LIME_TERRACOTTA = new USpecificItemData(new UItemData.LegacyCompactedData("stained_hardened_clay", (byte) 5), "lime_terracotta");
    public static final USpecificItemData PINK_TERRACOTTA = new USpecificItemData(new UItemData.LegacyCompactedData("stained_hardened_clay", (byte) 6), "pink_terracotta");
    public static final USpecificItemData GRAY_TERRACOTTA = new USpecificItemData(new UItemData.LegacyCompactedData("stained_hardened_clay", (byte) 7), "gray_terracotta");
    public static final USpecificItemData LIGHT_GRAY_TERRACOTTA = new USpecificItemData(new UItemData.LegacyCompactedData("stained_hardened_clay", (byte) 8), "light_gray_terracotta");
    public static final USpecificItemData CYAN_TERRACOTTA = new USpecificItemData(new UItemData.LegacyCompactedData("stained_hardened_clay", (byte) 9), "cyan_terracotta");
    public static final USpecificItemData PURPLE_TERRACOTTA = new USpecificItemData(new UItemData.LegacyCompactedData("stained_hardened_clay", (byte) 10), "purple_terracotta");
    public static final USpecificItemData BLUE_TERRACOTTA = new USpecificItemData(new UItemData.LegacyCompactedData("stained_hardened_clay", (byte) 11), "blue_terracotta");
    public static final USpecificItemData BROWN_TERRACOTTA = new USpecificItemData(new UItemData.LegacyCompactedData("stained_hardened_clay", (byte) 12), "brown_terracotta");
    public static final USpecificItemData GREEN_TERRACOTTA = new USpecificItemData(new UItemData.LegacyCompactedData("stained_hardened_clay", (byte) 13), "green_terracotta");
    public static final USpecificItemData RED_TERRACOTTA = new USpecificItemData(new UItemData.LegacyCompactedData("stained_hardened_clay", (byte) 14), "red_terracotta");
    public static final USpecificItemData BLACK_TERRACOTTA = new USpecificItemData(new UItemData.LegacyCompactedData("stained_hardened_clay", (byte) 15), "black_terracotta");

    // flowers
    public static final USpecificItemData POPPY = new USpecificItemData(new UItemData.LegacyCompactedData("red_flower", (byte) 0), "poppy");
    public static final USpecificItemData BLUE_ORCHID = new USpecificItemData(new UItemData.LegacyCompactedData("red_flower", (byte) 1), "blue_orchid");
    public static final USpecificItemData ALLIUM = new USpecificItemData(new UItemData.LegacyCompactedData("red_flower", (byte) 2), "allium");
    public static final USpecificItemData AZURE_BLUET = new USpecificItemData(new UItemData.LegacyCompactedData("red_flower", (byte) 3), "azure_bluet");
    public static final USpecificItemData RED_TULIP = new USpecificItemData(new UItemData.LegacyCompactedData("red_flower", (byte) 4), "red_tulip");
    public static final USpecificItemData ORANGE_TULIP = new USpecificItemData(new UItemData.LegacyCompactedData("red_flower", (byte) 5), "orange_tulip");
    public static final USpecificItemData WHITE_TULIP = new USpecificItemData(new UItemData.LegacyCompactedData("red_flower", (byte) 6), "white_tulip");
    public static final USpecificItemData PINK_TULIP = new USpecificItemData(new UItemData.LegacyCompactedData("red_flower", (byte) 7), "pink_tulip");
    public static final USpecificItemData OXEYE_DAISY = new USpecificItemData(new UItemData.LegacyCompactedData("red_flower", (byte) 8), "oxeye_daisy");

    // tall grass

    public static final USpecificItemData SHRUB = new USpecificItemData(new UItemData.LegacyCompactedData("tallgrass", (byte) 0), "shrub");
    public static final USpecificItemData TALL_GRASS = new USpecificItemData(new UItemData.LegacyCompactedData("tallgrass", (byte) 1), "tall_grass");
    public static final USpecificItemData FERN = new USpecificItemData(new UItemData.LegacyCompactedData("tallgrass", (byte) 2), "fern");

    // double plants
    public static final USpecificItemData SUNFLOWER = new USpecificItemData(new UItemData.LegacyCompactedData("double_plant", (byte) 0), "sunflower");
    public static final USpecificItemData LILAC = new USpecificItemData(new UItemData.LegacyCompactedData("double_plant", (byte) 1), "lilac");
    public static final USpecificItemData TALL_GRASS_DOUBLE = new USpecificItemData(new UItemData.LegacyCompactedData("double_plant", (byte) 2), "tall_grass_double");
    public static final USpecificItemData LARGE_FERN = new USpecificItemData(new UItemData.LegacyCompactedData("double_plant", (byte) 3), "large_fern");
    public static final USpecificItemData ROSE_BUSH = new USpecificItemData(new UItemData.LegacyCompactedData("double_plant", (byte) 4), "rose_bush");
    public static final USpecificItemData PEONY = new USpecificItemData(new UItemData.LegacyCompactedData("double_plant", (byte) 5), "peony");

    // logs
    public static final USpecificItemData OAK_LOG = new USpecificItemData(new UItemData.LegacyCompactedData("log", (byte) 0), "oak_log");
    public static final USpecificItemData SPRUCE_LOG = new USpecificItemData(new UItemData.LegacyCompactedData("log", (byte) 1), "spruce_log");
    public static final USpecificItemData BIRCH_LOG = new USpecificItemData(new UItemData.LegacyCompactedData("log", (byte) 2), "birch_log");
    public static final USpecificItemData JUNGLE_LOG = new USpecificItemData(new UItemData.LegacyCompactedData("log", (byte) 3), "jungle_log");
    public static final USpecificItemData ACACIA_LOG = new USpecificItemData(new UItemData.LegacyCompactedData("log2", (byte) 0), "acacia_log");
    public static final USpecificItemData DARK_OAK_LOG = new USpecificItemData(new UItemData.LegacyCompactedData("log2", (byte) 1), "dark_oak_log");

    // planks
    public static final USpecificItemData OAK_PLANKS = new USpecificItemData(new UItemData.LegacyCompactedData("planks", (byte) 0), "oak_planks");
    public static final USpecificItemData SPRUCE_PLANKS = new USpecificItemData(new UItemData.LegacyCompactedData("planks", (byte) 1), "spruce_planks");
    public static final USpecificItemData BIRCH_PLANKS = new USpecificItemData(new UItemData.LegacyCompactedData("planks", (byte) 2), "birch_planks");
    public static final USpecificItemData JUNGLE_PLANKS = new USpecificItemData(new UItemData.LegacyCompactedData("planks", (byte) 3), "jungle_planks");
    public static final USpecificItemData ACACIA_PLANKS = new USpecificItemData(new UItemData.LegacyCompactedData("planks", (byte) 4), "acacia_planks");
    public static final USpecificItemData DARK_OAK_PLANKS = new USpecificItemData(new UItemData.LegacyCompactedData("planks", (byte) 5), "dark_oak_planks");

    // slabs
    public static final USpecificItemData OAK_SLAB = new USpecificItemData(new UItemData.LegacyCompactedData("wooden_slab", (byte) 0), "oak_slab");
    public static final USpecificItemData SPRUCE_SLAB = new USpecificItemData(new UItemData.LegacyCompactedData("wooden_slab", (byte) 1), "spruce_slab");
    public static final USpecificItemData BIRCH_SLAB = new USpecificItemData(new UItemData.LegacyCompactedData("wooden_slab", (byte) 2), "birch_slab");
    public static final USpecificItemData JUNGLE_SLAB = new USpecificItemData(new UItemData.LegacyCompactedData("wooden_slab", (byte) 3), "jungle_slab");
    public static final USpecificItemData ACACIA_SLAB = new USpecificItemData(new UItemData.LegacyCompactedData("wooden_slab", (byte) 4), "acacia_slab");
    public static final USpecificItemData DARK_OAK_SLAB = new USpecificItemData(new UItemData.LegacyCompactedData("wooden_slab", (byte) 5), "dark_oak_slab");


    // saplings
    public static final UItemData OAK_SAPLING = new UItemData(new UItemData.LegacyCompactedData("sapling", (byte) 0), "oak_sapling");
    public static final UItemData SPRUCE_SAPLING = new UItemData(new UItemData.LegacyCompactedData("sapling", (byte) 1), "spruce_sapling");
    public static final UItemData BIRCH_SAPLING = new UItemData(new UItemData.LegacyCompactedData("sapling", (byte) 2), "birch_sapling");
    public static final UItemData JUNGLE_SAPLING = new UItemData(new UItemData.LegacyCompactedData("sapling", (byte) 3), "jungle_sapling");
    public static final UItemData ACACIA_SAPLING = new UItemData(new UItemData.LegacyCompactedData("sapling", (byte) 4), "acacia_sapling");
    public static final UItemData DARK_OAK_SAPLING = new UItemData(new UItemData.LegacyCompactedData("sapling", (byte) 5), "dark_oak_sapling");

    // leaves
    public static final UItemData OAK_LEAVES = new UItemData(new UItemData.LegacyCompactedData("leaves", (byte) 0), "oak_leaves");
    public static final UItemData SPRUCE_LEAVES = new UItemData(new UItemData.LegacyCompactedData("leaves", (byte) 1), "spruce_leaves");
    public static final UItemData BIRCH_LEAVES = new UItemData(new UItemData.LegacyCompactedData("leaves", (byte) 2), "birch_leaves");
    public static final UItemData JUNGLE_LEAVES = new UItemData(new UItemData.LegacyCompactedData("leaves", (byte) 3), "jungle_leaves");
    public static final UItemData ACACIA_LEAVES = new UItemData(new UItemData.LegacyCompactedData("leaves2", (byte) 0), "acacia_leaves");
    public static final UItemData DARK_OAK_LEAVES = new UItemData(new UItemData.LegacyCompactedData("leaves2", (byte) 1), "dark_oak_leaves");

    // sand
    public static final UItemData SAND = new UItemData(new UItemData.LegacyCompactedData("sand", (byte) 0), "sand");
    public static final UItemData RED_SAND = new UItemData(new UItemData.LegacyCompactedData("sand", (byte) 1), "red_sand");

    // sandstone
    public static final UItemData SANDSTONE = new UItemData(new UItemData.LegacyCompactedData("sandstone", (byte) 0), "sandstone");
    public static final UItemData CHISELED_SANDSTONE = new UItemData(new UItemData.LegacyCompactedData("sandstone", (byte) 1), "chiseled_sandstone");
    public static final UItemData SMOOTH_SANDSTONE = new UItemData(new UItemData.LegacyCompactedData("sandstone", (byte) 2), "smooth_sandstone");

    // red sandstone
    public static final UItemData RED_SANDSTONE = new UItemData(new UItemData.LegacyCompactedData("red_sandstone", (byte) 0), "red_sandstone");
    public static final UItemData CHISELED_RED_SANDSTONE = new UItemData(new UItemData.LegacyCompactedData("red_sandstone", (byte) 1), "chiseled_red_sandstone");
    public static final UItemData SMOOTH_RED_SANDSTONE = new UItemData(new UItemData.LegacyCompactedData("red_sandstone", (byte) 2), "smooth_red_sandstone");

    // stone
    public static final UItemData STONE = new UItemData(new UItemData.LegacyCompactedData("stone", (byte) 0), "stone");
    public static final UItemData GRANITE = new UItemData(new UItemData.LegacyCompactedData("stone", (byte) 1), "granite");
    public static final UItemData POLISHED_GRANITE = new UItemData(new UItemData.LegacyCompactedData("stone", (byte) 2), "polished_granite");
    public static final UItemData DIORITE = new UItemData(new UItemData.LegacyCompactedData("stone", (byte) 3), "diorite");
    public static final UItemData POLISHED_DIORITE = new UItemData(new UItemData.LegacyCompactedData("stone", (byte) 4), "polished_diorite");
    public static final UItemData ANDESITE = new UItemData(new UItemData.LegacyCompactedData("stone", (byte) 5), "andesite");
    public static final UItemData POLISHED_ANDESITE = new UItemData(new UItemData.LegacyCompactedData("stone", (byte) 6), "polished_andesite");

    // prismarine
    public static final UItemData PRISMARINE = new UItemData(new UItemData.LegacyCompactedData("prismarine", (byte) 0), "prismarine");
    public static final UItemData PRISMARINE_BRICKS = new UItemData(new UItemData.LegacyCompactedData("prismarine", (byte) 1), "prismarine_bricks");
    public static final UItemData DARK_PRISMARINE = new UItemData(new UItemData.LegacyCompactedData("prismarine", (byte) 2), "dark_prismarine");


    // MOB SPAWNERS
    public static final UCreatureSpawner CREEPER_SPAWNER = new UCreatureSpawner("mob_spawner", "creeper_spawner");
    public static final UCreatureSpawner SKELETON_SPAWNER = new UCreatureSpawner("mob_spawner", "skeleton_spawner");
    public static final UCreatureSpawner SPIDER_SPAWNER = new UCreatureSpawner("mob_spawner", "spider_spawner");
    public static final UCreatureSpawner GIANT_SPAWNER = new UCreatureSpawner("mob_spawner", "giant_spawner");
    public static final UCreatureSpawner ZOMBIE_SPAWNER = new UCreatureSpawner("mob_spawner", "zombie_spawner");
    public static final UCreatureSpawner SLIME_SPAWNER = new UCreatureSpawner("mob_spawner", "slime_spawner");
    public static final UCreatureSpawner GHAST_SPAWNER = new UCreatureSpawner("mob_spawner", "ghast_spawner");
    public static final UCreatureSpawner PIGMAN_SPAWNER = new UCreatureSpawner("mob_spawner", "pigman_spawner");
    public static final UCreatureSpawner ENDERMAN_SPAWNER = new UCreatureSpawner("mob_spawner", "enderman_spawner");
    public static final UCreatureSpawner CAVE_SPIDER_SPAWNER = new UCreatureSpawner("mob_spawner", "cave_spider_spawner");
    public static final UCreatureSpawner SILVERFISH_SPAWNER = new UCreatureSpawner("mob_spawner", "silverfish_spawner");
    public static final UCreatureSpawner BLAZE_SPAWNER = new UCreatureSpawner("mob_spawner", "blaze_spawner");
    public static final UCreatureSpawner MAGMA_CUBE_SPAWNER = new UCreatureSpawner("mob_spawner", "magma_cube_spawner");
    public static final UCreatureSpawner ENDER_DRAGON_SPAWNER = new UCreatureSpawner("mob_spawner", "ender_dragon_spawner");
    public static final UCreatureSpawner WITHER_SPAWNER = new UCreatureSpawner("mob_spawner", "wither_spawner");
    public static final UCreatureSpawner BAT_SPAWNER = new UCreatureSpawner("mob_spawner", "bat_spawner");
    public static final UCreatureSpawner WITCH_SPAWNER = new UCreatureSpawner("mob_spawner", "witch_spawner");
    public static final UCreatureSpawner ENDERMITE_SPAWNER = new UCreatureSpawner("mob_spawner", "endermite_spawner");
    public static final UCreatureSpawner GUARDIAN_SPAWNER = new UCreatureSpawner("mob_spawner", "guardian_spawner");



    // bricks
    public static final UItemData BRICKS = new UItemData(new UItemData.LegacyCompactedData("brick_block", (byte) 0), "bricks");

    // nether bricks
    public static final UItemData NETHER_BRICKS = new UItemData(new UItemData.LegacyCompactedData("nether_brick", (byte) 0), "nether_bricks");

    // quartz
    public static final UItemData QUARTZ = new UItemData(new UItemData.LegacyCompactedData("quartz_block", (byte) 0), "quartz");
    public static final UItemData CHISELED_QUARTZ = new UItemData(new UItemData.LegacyCompactedData("quartz_block", (byte) 1), "chiseled_quartz");
    public static final UItemData PILLAR_QUARTZ = new UItemData(new UItemData.LegacyCompactedData("quartz_block", (byte) 2), "quartz_pillar");



    // banners
    public static final UItemData WHITE_BANNER = new UItemData(new UItemData.LegacyCompactedData("banner", (byte) 0), "white_banner");
    public static final UItemData ORANGE_BANNER = new UItemData(new UItemData.LegacyCompactedData("banner", (byte) 1), "orange_banner");
    public static final UItemData MAGENTA_BANNER = new UItemData(new UItemData.LegacyCompactedData("banner", (byte) 2), "magenta_banner");
    public static final UItemData LIGHT_BLUE_BANNER = new UItemData(new UItemData.LegacyCompactedData("banner", (byte) 3), "light_blue_banner");
    public static final UItemData YELLOW_BANNER = new UItemData(new UItemData.LegacyCompactedData("banner", (byte) 4), "yellow_banner");
    public static final UItemData LIME_BANNER = new UItemData(new UItemData.LegacyCompactedData("banner", (byte) 5), "lime_banner");
    public static final UItemData PINK_BANNER = new UItemData(new UItemData.LegacyCompactedData("banner", (byte) 6), "pink_banner");
    public static final UItemData GRAY_BANNER = new UItemData(new UItemData.LegacyCompactedData("banner", (byte) 7), "gray_banner");
    public static final UItemData LIGHT_GRAY_BANNER = new UItemData(new UItemData.LegacyCompactedData("banner", (byte) 8), "light_gray_banner");
    public static final UItemData CYAN_BANNER = new UItemData(new UItemData.LegacyCompactedData("banner", (byte) 9), "cyan_banner");
    public static final UItemData PURPLE_BANNER = new UItemData(new UItemData.LegacyCompactedData("banner", (byte) 10), "purple_banner");
    public static final UItemData BLUE_BANNER = new UItemData(new UItemData.LegacyCompactedData("banner", (byte) 11), "blue_banner");
    public static final UItemData BROWN_BANNER = new UItemData(new UItemData.LegacyCompactedData("banner", (byte) 12), "brown_banner");
    public static final UItemData GREEN_BANNER = new UItemData(new UItemData.LegacyCompactedData("banner", (byte) 13), "green_banner");
    public static final UItemData RED_BANNER = new UItemData(new UItemData.LegacyCompactedData("banner", (byte) 14), "red_banner");
    public static final UItemData BLACK_BANNER = new UItemData(new UItemData.LegacyCompactedData("banner", (byte) 15), "black_banner");

    // beds
    public static final UItemData LEGACY_BED = new UItemData(new UItemData.LegacyCompactedData("bed", (byte) 0), "bed");

    // slime
    public static final UItemData SLIME_BLOCK = new UItemData(new UItemData.LegacyCompactedData("slime", (byte) 0), "slime_block");

    // sugar cane
    public static final UItemData SUGAR_CANE = new UItemData(new UItemData.LegacyCompactedData("reeds", (byte) 0), "sugar_cane");


    // items
    public static final UItemData MELON_SEEDS = new UItemData("melon_seeds","melon_seeds");
    public static final UItemData GOLDEN_HORSE_ARMOR = new UItemData("golden_horse_armor","golden_horse_armor");
    public static final UItemData WOODEN_SWORD = new UItemData("wooden_sword","wooden_sword");
    public static final UItemData GOLDEN_APPLE = new UItemData("golden_apple","golden_apple");
    public static final UItemData GOLD_NUGGET = new UItemData("gold_nugget","gold_nugget");
    public static final UItemData GOLDEN_LEGGINGS = new UItemData("golden_leggings","golden_leggings");
    public static final UItemData CARROT_ON_A_STICK = new UItemData("carrot_on_a_stick","carrot_on_a_stick");
    public static final UItemData IRON_BOOTS = new UItemData("iron_boots","iron_boots");
    public static final UItemData GOLDEN_AXE = new UItemData("golden_axe","golden_axe");
    public static final UItemData SHEARS = new UItemData("shears","shears");
    public static final UItemData GOLDEN_PICKAXE = new UItemData("golden_pickaxe","golden_pickaxe");
    public static final UItemData CHAINMAIL_HELMET = new UItemData("chainmail_helmet","chainmail_helmet");
    public static final UItemData HOPPER_MINECART = new UItemData("hopper_minecart","hopper_minecart");
    public static final UItemData BREAD = new UItemData("bread","bread");
    public static final UItemData SADDLE = new UItemData("saddle","saddle");
    public static final UItemData PAINTING = new UItemData("painting","painting");
    public static final UItemData STONE_HOE = new UItemData("stone_hoe","stone_hoe");
    public static final UItemData IRON_HOE = new UItemData("iron_hoe","iron_hoe");
    public static final UItemData RABBIT_STEW = new UItemData("rabbit_stew","rabbit_stew");
    public static final UItemData STONE_PICKAXE = new UItemData("stone_pickaxe","stone_pickaxe");
    public static final UItemData POTATO = new UItemData("potato","potato");
    public static final UItemData COOKED_CHICKEN = new UItemData("cooked_chicken","cooked_chicken");
    public static final UItemData CHAINMAIL_BOOTS = new UItemData("chainmail_boots","chainmail_boots");
    public static final UItemData GHAST_TEAR = new UItemData("ghast_tear","ghast_tear");
    public static final UItemData FIRE_CHARGE = new UItemData("fire_charge","fire_charge");
    public static final UItemData EXPERIENCE_BOTTLE = new UItemData("experience_bottle","experience_bottle");
    public static final UItemData COMMAND_BLOCK_MINECART = new UItemData("command_block_minecart","command_block_minecart");
    public static final UItemData GUNPOWDER = new UItemData("gunpowder","gunpowder");
    public static final UItemData MUSHROOM_STEW = new UItemData("mushroom_stew","mushroom_stew");
    public static final UItemData FLINT_AND_STEEL = new UItemData("flint_and_steel","flint_and_steel");
    public static final UItemData IRON_INGOT = new UItemData("iron_ingot","iron_ingot");
    public static final UItemData IRON_CHESTPLATE = new UItemData("iron_chestplate","iron_chestplate");
    public static final UItemData PRISMARINE_SHARD = new UItemData("prismarine_shard","prismarine_shard");
    public static final UItemData BEEF = new UItemData("beef","beef");
    public static final UItemData CLOCK = new UItemData("clock","clock");
    public static final UItemData MUTTON = new UItemData("mutton","mutton");
    public static final UItemData MAP = new UItemData("map","map");
    public static final UItemData DIAMOND_HORSE_ARMOR = new UItemData("diamond_horse_armor","diamond_horse_armor");
    public static final UItemData CHEST_MINECART = new UItemData("chest_minecart","chest_minecart");
    public static final UItemData BAKED_POTATO = new UItemData("baked_potato","baked_potato");
    public static final UItemData DIAMOND_SWORD = new UItemData("diamond_sword","diamond_sword");
    public static final UItemData DIAMOND = new UItemData("diamond","diamond");
    public static final UItemData WOODEN_SHOVEL = new UItemData("wooden_shovel","wooden_shovel");
    public static final UItemData SPIDER_EYE = new UItemData("spider_eye","spider_eye");
    public static final UItemData GLOWSTONE_DUST = new UItemData("glowstone_dust","glowstone_dust");
    public static final UItemData GOLD_INGOT = new UItemData("gold_ingot","gold_ingot");
    public static final UItemData DIAMOND_HOE = new UItemData("diamond_hoe","diamond_hoe");
    public static final UItemData GOLDEN_SHOVEL = new UItemData("golden_shovel","golden_shovel");
    public static final UItemData ITEM_FRAME = new UItemData("item_frame","item_frame");
    public static final UItemData ARROW = new UItemData("arrow","arrow");
    public static final UItemData CHAINMAIL_CHESTPLATE = new UItemData("chainmail_chestplate","chainmail_chestplate");
    public static final UItemData ENDER_EYE = new UItemData("ender_eye","ender_eye");
    public static final UItemData GOLDEN_HOE = new UItemData("golden_hoe","golden_hoe");
    public static final UItemData FURNACE_MINECART = new UItemData("furnace_minecart","furnace_minecart");
    public static final UItemData WRITTEN_BOOK = new UItemData("written_book","written_book");
    public static final UItemData IRON_SHOVEL = new UItemData("iron_shovel","iron_shovel");
    public static final UItemData DIAMOND_PICKAXE = new UItemData("diamond_pickaxe","diamond_pickaxe");
    public static final UItemData EMERALD = new UItemData("emerald","emerald");
    public static final UItemData DIAMOND_HELMET = new UItemData("diamond_helmet","diamond_helmet");
    public static final UItemData GOLDEN_CARROT = new UItemData("golden_carrot","golden_carrot");
    public static final UItemData GOLDEN_BOOTS = new UItemData("golden_boots","golden_boots");
    public static final UItemData PRISMARINE_CRYSTALS = new UItemData("prismarine_crystals","prismarine_crystals");
    public static final UItemData ENCHANTED_BOOK = new UItemData("enchanted_book","enchanted_book");
    public static final UItemData CLAY_BALL = new UItemData("clay_ball","clay_ball");
    public static final UItemData LEATHER_BOOTS = new UItemData("leather_boots","leather_boots");
    public static final UItemData MILK_BUCKET = new UItemData("milk_bucket","milk_bucket");
    public static final UItemData IRON_HELMET = new UItemData("iron_helmet","iron_helmet");
    public static final UItemData COOKED_BEEF = new UItemData("cooked_beef","cooked_beef");
    public static final UItemData STRING = new UItemData("string","string");
    public static final UItemData NETHER_STAR = new UItemData("nether_star","nether_star");
    public static final UItemData BLAZE_POWDER = new UItemData("blaze_powder","blaze_powder");
    public static final UItemData COOKED_MUTTON = new UItemData("cooked_mutton","cooked_mutton");
    public static final UItemData LEAD = new UItemData("lead","lead");
    public static final UItemData LEATHER_LEGGINGS = new UItemData("leather_leggings","leather_leggings");
    public static final UItemData COMPASS = new UItemData("compass","compass");
    public static final UItemData RABBIT_FOOT = new UItemData("rabbit_foot","rabbit_foot");
    public static final UItemData APPLE = new UItemData("apple","apple");
    public static final UItemData REDSTONE = new UItemData("redstone","redstone");
    public static final UItemData FISHING_ROD = new UItemData("fishing_rod","fishing_rod");
    public static final UItemData GOLDEN_CHESTPLATE = new UItemData("golden_chestplate","golden_chestplate");
    public static final UItemData BUCKET = new UItemData("bucket","bucket");
    public static final UItemData COAL = new UItemData("coal","coal");
    public static final UItemData ENDER_PEARL = new UItemData("ender_pearl","ender_pearl");
    public static final UItemData CARROT = new UItemData("carrot","carrot");
    public static final UItemData MINECART = new UItemData("minecart","minecart");
    public static final UItemData POTION = new UItemData("potion","potion");
    public static final UItemData GLASS_BOTTLE = new UItemData("glass_bottle","glass_bottle");
    public static final UItemData WOODEN_HOE = new UItemData("wooden_hoe","wooden_hoe");
    public static final UItemData SIGN = new UItemData("sign","sign");
    public static final UItemData DIAMOND_LEGGINGS = new UItemData("diamond_leggings","diamond_leggings");
    public static final UItemData DIAMOND_SHOVEL = new UItemData("diamond_shovel","diamond_shovel");
    public static final UItemData LEATHER_HELMET = new UItemData("leather_helmet","leather_helmet");
    public static final UItemData MAGMA_CREAM = new UItemData("magma_cream","magma_cream");
    public static final UItemData TNT_MINECART = new UItemData("tnt_minecart","tnt_minecart");
    public static final UItemData GOLDEN_SWORD = new UItemData("golden_sword","golden_sword");
    public static final UItemData ARMOR_STAND = new UItemData("armor_stand","armor_stand");
    public static final UItemData NAME_TAG = new UItemData("name_tag","name_tag");
    public static final UItemData COOKED_PORKCHOP = new UItemData("cooked_porkchop","cooked_porkchop");
    public static final UItemData PUMPKIN_SEEDS = new UItemData("pumpkin_seeds","pumpkin_seeds");
    public static final UItemData BOW = new UItemData("bow","bow");
    public static final UItemData WOODEN_AXE = new UItemData("wooden_axe","wooden_axe");
    public static final UItemData FILLED_MAP = new UItemData("filled_map","filled_map");
    public static final UItemData SUGAR = new UItemData("sugar","sugar");
    public static final UItemData RABBIT_HIDE = new UItemData("rabbit_hide","rabbit_hide");
    public static final UItemData DIAMOND_BOOTS = new UItemData("diamond_boots","diamond_boots");
    public static final UItemData WRITABLE_BOOK = new UItemData("writable_book","writable_book");
    public static final UItemData COOKIE = new UItemData("cookie","cookie");
    public static final UItemData IRON_LEGGINGS = new UItemData("iron_leggings","iron_leggings");
    public static final UItemData FLINT = new UItemData("flint","flint");
    public static final UItemData LAVA_BUCKET = new UItemData("lava_bucket","lava_bucket");
    public static final UItemData GOLDEN_HELMET = new UItemData("golden_helmet","golden_helmet");
    public static final UItemData RABBIT = new UItemData("rabbit","rabbit");
    public static final UItemData STONE_SWORD = new UItemData("stone_sword","stone_sword");
    public static final UItemData DIAMOND_AXE = new UItemData("diamond_axe","diamond_axe");
    public static final UItemData PUMPKIN_PIE = new UItemData("pumpkin_pie","pumpkin_pie");
    public static final UItemData ROTTEN_FLESH = new UItemData("rotten_flesh","rotten_flesh");
    public static final UItemData STONE_AXE = new UItemData("stone_axe","stone_axe");
    public static final UItemData STICK = new UItemData("stick","stick");
    public static final UItemData WATER_BUCKET = new UItemData("water_bucket","water_bucket");
    public static final UItemData IRON_AXE = new UItemData("iron_axe","iron_axe");
    public static final UItemData IRON_HORSE_ARMOR = new UItemData("iron_horse_armor","iron_horse_armor");
    public static final UItemData WHEAT_SEEDS = new UItemData("wheat_seeds","wheat_seeds");
    public static final UItemData CHICKEN = new UItemData("chicken","chicken");
    public static final UItemData LEATHER = new UItemData("leather","leather");
    public static final UItemData STONE_SHOVEL = new UItemData("stone_shovel","stone_shovel");
    public static final UItemData CHAINMAIL_LEGGINGS = new UItemData("chainmail_leggings","chainmail_leggings");
    public static final UItemData BONE = new UItemData("bone","bone");
    public static final UItemData POISONOUS_POTATO = new UItemData("poisonous_potato","poisonous_potato");
    public static final UItemData SNOWBALL = new UItemData("snowball","snowball");
    public static final UItemData IRON_PICKAXE = new UItemData("iron_pickaxe","iron_pickaxe");
    public static final UItemData EGG = new UItemData("egg","egg");
    public static final UItemData PORKCHOP = new UItemData("porkchop","porkchop");
    public static final UItemData WOODEN_PICKAXE = new UItemData("wooden_pickaxe","wooden_pickaxe");
    public static final UItemData BRICK = new UItemData("brick","brick");
    public static final UItemData PAPER = new UItemData("paper","paper");
    public static final UItemData FERMENTED_SPIDER_EYE = new UItemData("fermented_spider_eye","fermented_spider_eye");
    public static final UItemData LEATHER_CHESTPLATE = new UItemData("leather_chestplate","leather_chestplate");
    public static final UItemData FEATHER = new UItemData("feather","feather");
    public static final UItemData IRON_SWORD = new UItemData("iron_sword","iron_sword");
    public static final UItemData DIAMOND_CHESTPLATE = new UItemData("diamond_chestplate","diamond_chestplate");
    public static final UItemData COOKED_RABBIT = new UItemData("cooked_rabbit","cooked_rabbit");
    public static final UItemData BLAZE_ROD = new UItemData("blaze_rod","blaze_rod");
    public static final UItemData BOOK = new UItemData("book","book");
    public static final UItemData BOWL = new UItemData("bowl","bowl");

    // Creature spawn eggs
    public static final UItemData CREEPER_SPAWN_EGG = new UItemData(new UItemData.LegacyCompactedData("spawn_egg", (byte) 50), "creeper_spawn_egg");
    public static final UItemData SKELETON_SPAWN_EGG = new UItemData(new UItemData.LegacyCompactedData("spawn_egg", (byte) 51), "skeleton_spawn_egg");
    public static final UItemData SPIDER_SPAWN_EGG = new UItemData(new UItemData.LegacyCompactedData("spawn_egg", (byte) 52), "spider_spawn_egg");
    public static final UItemData GIANT_SPAWN_EGG = new UItemData(new UItemData.LegacyCompactedData("spawn_egg", (byte) 53), "giant_spawn_egg");
    public static final UItemData ZOMBIE_SPAWN_EGG = new UItemData(new UItemData.LegacyCompactedData("spawn_egg", (byte) 54), "zombie_spawn_egg");
    public static final UItemData SLIME_SPAWN_EGG = new UItemData(new UItemData.LegacyCompactedData("spawn_egg", (byte) 55), "slime_spawn_egg");
    public static final UItemData GHAST_SPAWN_EGG = new UItemData(new UItemData.LegacyCompactedData("spawn_egg", (byte) 56), "ghast_spawn_egg");
    public static final UItemData PIGMAN_SPAWN_EGG = new UItemData(new UItemData.LegacyCompactedData("spawn_egg", (byte) 57), "pigman_spawn_egg");
    public static final UItemData ENDERMAN_SPAWN_EGG = new UItemData(new UItemData.LegacyCompactedData("spawn_egg", (byte) 58), "enderman_spawn_egg");
    public static final UItemData CAVE_SPIDER_SPAWN_EGG = new UItemData(new UItemData.LegacyCompactedData("spawn_egg", (byte) 59), "cave_spider_spawn_egg");
    public static final UItemData SILVERFISH_SPAWN_EGG = new UItemData(new UItemData.LegacyCompactedData("spawn_egg", (byte) 60), "silverfish_spawn_egg");
    public static final UItemData BLAZE_SPAWN_EGG = new UItemData(new UItemData.LegacyCompactedData("spawn_egg", (byte) 61), "blaze_spawn_egg");
    public static final UItemData MAGMA_CUBE_SPAWN_EGG = new UItemData(new UItemData.LegacyCompactedData("spawn_egg", (byte) 62), "magma_cube_spawn_egg");
    public static final UItemData ENDER_DRAGON_SPAWN_EGG = new UItemData(new UItemData.LegacyCompactedData("spawn_egg", (byte) 63), "ender_dragon_spawn_egg");
    public static final UItemData WITHER_SPAWN_EGG = new UItemData(new UItemData.LegacyCompactedData("spawn_egg", (byte) 64), "wither_spawn_egg");
    public static final UItemData BAT_SPAWN_EGG = new UItemData(new UItemData.LegacyCompactedData("spawn_egg", (byte) 65), "bat_spawn_egg");
    public static final UItemData WITCH_SPAWN_EGG = new UItemData(new UItemData.LegacyCompactedData("spawn_egg", (byte) 66), "witch_spawn_egg");
    public static final UItemData ENDERMITE_SPAWN_EGG = new UItemData(new UItemData.LegacyCompactedData("spawn_egg", (byte) 67), "endermite_spawn_egg");
    public static final UItemData GUARDIAN_SPAWN_EGG = new UItemData(new UItemData.LegacyCompactedData("spawn_egg", (byte) 68), "guardian_spawn_egg");
    public static final UItemData PIG_SPAWN_EGG = new UItemData(new UItemData.LegacyCompactedData("spawn_egg", (byte) 90), "pig_spawn_egg");
    public static final UItemData SHEEP_SPAWN_EGG = new UItemData(new UItemData.LegacyCompactedData("spawn_egg", (byte) 91), "sheep_spawn_egg");
    public static final UItemData COW_SPAWN_EGG = new UItemData(new UItemData.LegacyCompactedData("spawn_egg", (byte) 92), "cow_spawn_egg");
    public static final UItemData CHICKEN_SPAWN_EGG = new UItemData(new UItemData.LegacyCompactedData("spawn_egg", (byte) 93), "chicken_spawn_egg");
    public static final UItemData SQUID_SPAWN_EGG = new UItemData(new UItemData.LegacyCompactedData("spawn_egg", (byte) 94), "squid_spawn_egg");
    public static final UItemData WOLF_SPAWN_EGG = new UItemData(new UItemData.LegacyCompactedData("spawn_egg", (byte) 95), "wolf_spawn_egg");
    public static final UItemData MOOSHROOM_SPAWN_EGG = new UItemData(new UItemData.LegacyCompactedData("spawn_egg", (byte) 96), "mooshroom_spawn_egg");
    public static final UItemData SNOWMAN_SPAWN_EGG = new UItemData(new UItemData.LegacyCompactedData("spawn_egg", (byte) 97), "snowman_spawn_egg");
    public static final UItemData OCELOT_SPAWN_EGG = new UItemData(new UItemData.LegacyCompactedData("spawn_egg", (byte) 98), "ocelot_spawn_egg");
    public static final UItemData IRON_GOLEM_SPAWN_EGG = new UItemData(new UItemData.LegacyCompactedData("spawn_egg", (byte) 99), "iron_golem_spawn_egg");
    public static final UItemData HORSE_SPAWN_EGG = new UItemData(new UItemData.LegacyCompactedData("spawn_egg", (byte) 100), "horse_spawn_egg");
    public static final UItemData RABBIT_SPAWN_EGG = new UItemData(new UItemData.LegacyCompactedData("spawn_egg", (byte) 101), "rabbit_spawn_egg");

    // records
    public static final UItemData RECORD_13 = new UItemData("record_13","music_disc_13");
    public static final UItemData RECORD_CAT = new UItemData("record_cat","music_disc_cat");
    public static final UItemData RECORD_BLOCKS = new UItemData("record_blocks","music_disc_blocks");
    public static final UItemData RECORD_CHIRP = new UItemData("record_chirp","music_disc_chirp");
    public static final UItemData RECORD_FAR = new UItemData("record_far","music_disc_far");
    public static final UItemData RECORD_MALL = new UItemData("record_mall","music_disc_mall");
    public static final UItemData RECORD_MELLOHI = new UItemData("record_mellohi","music_disc_mellohi");
    public static final UItemData RECORD_STAL = new UItemData("record_stal","music_disc_stal");
    public static final UItemData RECORD_STRAD = new UItemData("record_strad","music_disc_strad");
    public static final UItemData RECORD_WARD = new UItemData("record_ward","music_disc_ward");
    public static final UItemData RECORD_11 = new UItemData("record_11","music_disc_11");
    public static final UItemData RECORD_WAIT = new UItemData("record_wait","music_disc_wait");

    // dyes
    public static final UItemData INK_SAC = new UItemData(new UItemData.LegacyCompactedData("dye", (byte) 0), "ink_sac");
    public static final UItemData ROSE_RED = new UItemData(new UItemData.LegacyCompactedData("dye", (byte) 1), "rose_red");
    public static final UItemData CACTUS_GREEN = new UItemData(new UItemData.LegacyCompactedData("dye", (byte) 2), "cactus_green");
    public static final UItemData COCOA_BEANS = new UItemData(new UItemData.LegacyCompactedData("dye", (byte) 3), "cocoa_beans");
    public static final UItemData LAPIS_LAZULI = new UItemData(new UItemData.LegacyCompactedData("dye", (byte) 4), "lapis_lazuli");
    public static final UItemData PURPLE_DYE = new UItemData(new UItemData.LegacyCompactedData("dye", (byte) 5), "purple_dye");
    public static final UItemData CYAN_DYE = new UItemData(new UItemData.LegacyCompactedData("dye", (byte) 6), "cyan_dye");
    public static final UItemData LIGHT_GRAY_DYE = new UItemData(new UItemData.LegacyCompactedData("dye", (byte) 7), "light_gray_dye");
    public static final UItemData GRAY_DYE = new UItemData(new UItemData.LegacyCompactedData("dye", (byte) 8), "gray_dye");
    public static final UItemData PINK_DYE = new UItemData(new UItemData.LegacyCompactedData("dye", (byte) 9), "pink_dye");
    public static final UItemData LIME_DYE = new UItemData(new UItemData.LegacyCompactedData("dye", (byte) 10), "lime_dye");
    public static final UItemData DANDELION_YELLOW = new UItemData(new UItemData.LegacyCompactedData("dye", (byte) 11), "dandelion_yellow");
    public static final UItemData LIGHT_BLUE_DYE = new UItemData(new UItemData.LegacyCompactedData("dye", (byte) 12), "light_blue_dye");
    public static final UItemData MAGENTA_DYE = new UItemData(new UItemData.LegacyCompactedData("dye", (byte) 13), "magenta_dye");
    public static final UItemData ORANGE_DYE = new UItemData(new UItemData.LegacyCompactedData("dye", (byte) 14), "orange_dye");
    public static final UItemData BONE_MEAL = new UItemData(new UItemData.LegacyCompactedData("dye", (byte) 15), "bone_meal");
    public static final UItemData SPECKLED_MELON = new UItemData("speckled_melon","glistering_melon_slice");
    public static final UItemData CAULDRON = new UItemData("cauldron","cauldron");
    // skulls
    public static final UItemData SKELETON_SKULL = new UItemData(new UItemData.LegacyCompactedData("skull", (byte) 0), "skeleton_skull");
    public static final UItemData WITHER_SKELETON_SKULL = new UItemData(new UItemData.LegacyCompactedData("skull", (byte) 1), "wither_skeleton_skull");
    public static final UItemData ZOMBIE_HEAD = new UItemData(new UItemData.LegacyCompactedData("skull", (byte) 2), "zombie_head");
    public static final UItemData HEAD = new UItemData(new UItemData.LegacyCompactedData("skull", (byte) 3), "head");
    public static final UItemData CREEPER_HEAD = new UItemData(new UItemData.LegacyCompactedData("skull", (byte) 4), "creeper_head");

    private static final Map<Material,String>  MATERIAL_BY_NAME_REVERSE_MAP_FIELD;

    static {
        try {
            Field field = Material.class.getDeclaredField("MATERIAL_BY_NAME");
            field.setAccessible(true);
            Map<String, Material> byName = (Map<String, Material>) field.get(null);

            Map<Material,String> byNameReverse = new HashMap<>();
            for (Map.Entry<String, Material> entry : byName.entrySet()) {
                byNameReverse.put(entry.getValue(), entry.getKey());
            }
            MATERIAL_BY_NAME_REVERSE_MAP_FIELD = Collections.unmodifiableMap(byNameReverse);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }







    public static Material matchMaterial(String name, int legacyId) {
        if (NMSVersionUtil.isLegacy()) {
            try {
                Method method = Material.class.getMethod("getMaterial", int.class);
                return (Material) method.invoke(null, legacyId);
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        return Material.getMaterial(name);
    }

    public static Material matchMaterial(String name, String legacyName) {
        if (NMSVersionUtil.isLegacy()) {
            return Material.matchMaterial(legacyName);
        }
        return Material.matchMaterial(name);
    }
    public static Material getMaterial(String name, String legacyName) {
        if (NMSVersionUtil.isLegacy()) {
            return Material.getMaterial(legacyName);
        }
        return Material.getMaterial(name);
    }

    public static AbstractUItemData fromMaterial(Material material) {
       return UItemData.getItemDataMap().get(MATERIAL_BY_NAME_REVERSE_MAP_FIELD.get(material));
    }

    public static boolean isEquivalent(Material material, AbstractUItemData itemData) {
        return fromMaterial(material).equals(itemData);
    }
}
