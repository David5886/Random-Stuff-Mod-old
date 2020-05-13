package com.faidedtech.randomstuff.util;

import com.faidedtech.randomstuff.RandomStuff;
import com.faidedtech.randomstuff.blocks.SilverBlock;
import com.faidedtech.randomstuff.enums.RandomStuffTier;
import com.faidedtech.randomstuff.items.Amethyst;
import com.faidedtech.randomstuff.items.AmethystAxe;
import com.faidedtech.randomstuff.items.AmethystHoe;
import com.faidedtech.randomstuff.items.AmethystPick;
import com.faidedtech.randomstuff.items.AmethystShovel;
import com.faidedtech.randomstuff.items.AmethystSword;
import com.faidedtech.randomstuff.items.DefaultItem;
import com.faidedtech.randomstuff.items.EmeraldAxe;
import com.faidedtech.randomstuff.items.EmeraldHoe;
import com.faidedtech.randomstuff.items.EmeraldPick;
import com.faidedtech.randomstuff.items.EmeraldShovel;
import com.faidedtech.randomstuff.items.EmeraldSword;
import com.faidedtech.randomstuff.items.FireSword;
import com.faidedtech.randomstuff.items.ItemBase;
import com.faidedtech.randomstuff.items.LeadAxe;
import com.faidedtech.randomstuff.items.LeadHoe;
import com.faidedtech.randomstuff.items.LeadIngot;
import com.faidedtech.randomstuff.items.LeadPick;
import com.faidedtech.randomstuff.items.LeadShovel;
import com.faidedtech.randomstuff.items.LeadSword;
import com.faidedtech.randomstuff.items.NitroniumAxe;
import com.faidedtech.randomstuff.items.NitroniumCrystal;
import com.faidedtech.randomstuff.items.NitroniumHoe;
import com.faidedtech.randomstuff.items.NitroniumIngot;
import com.faidedtech.randomstuff.items.NitroniumPick;
import com.faidedtech.randomstuff.items.NitroniumShovel;
import com.faidedtech.randomstuff.items.NitroniumSword;
import com.faidedtech.randomstuff.items.ObsidianIngot;
import com.faidedtech.randomstuff.items.OrangeIngot;
import com.faidedtech.randomstuff.items.PlatinumIngot;
import com.faidedtech.randomstuff.items.RandomAxe;
import com.faidedtech.randomstuff.items.RandomHoe;
import com.faidedtech.randomstuff.items.RandomPick;
import com.faidedtech.randomstuff.items.RandomShovel;
import com.faidedtech.randomstuff.items.RandomSword;
import com.faidedtech.randomstuff.items.SilverIngot;
import com.faidedtech.randomstuff.items.SuperDiamond;
import com.faidedtech.randomstuff.items.SuperDiamondChunk;
import com.faidedtech.randomstuff.items.SuperDiamondSmallChunk;
import com.faidedtech.randomstuff.items.TinIngot;
import com.faidedtech.randomstuff.items.TitaniumIngot;
import com.faidedtech.randomstuff.items.WaterSword;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Class that registers items and block items into the game
 * @author David Adams
 *
 */
public class RegistryHandler {
	
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, RandomStuff.MODID);

	/**
	 * Initialize items
	 */
	public static void init() {
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		//entities.register and so on and so fourth
	}
	/**
	 * Create food below. Create like a normal item. But add the .food to properties
	 */
	//public static final RegistryObject<Item> TEST_FOOD = ITEMS.register("test_food", () -> new DefaultItem(new Item.Properties().food(new Food.Builder().hunger(6).saturation(1.2f).build())));
	
	
	/**
	 * Create new items below
	 */
	public static final RegistryObject<Item> ITEM_NAME = ITEMS.register("debug", ItemBase::new); //template for new items/adds debug item to the game
	public static final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst", Amethyst::new);
	public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", SilverIngot::new); //Adds and registers silver ingot
	public static final RegistryObject<Item> ORANGE_INGOT = ITEMS.register("orange_ingot", OrangeIngot::new);
	public static final RegistryObject<Item> OBSIDIAN_INGOT = ITEMS.register("obsidian_ingot", ObsidianIngot::new);
	public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot", LeadIngot::new);
	public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot", PlatinumIngot::new);
	public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot", TitaniumIngot::new);
	public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", TinIngot::new);
	public static final RegistryObject<Item> NITRONIUM_INGOT = ITEMS.register("nitronium_ingot", NitroniumIngot::new);
	public static final RegistryObject<Item> NITRONIUM_CRYSTAL = ITEMS.register("nitronium_crystal", NitroniumCrystal::new);
	public static final RegistryObject<Item> SUPER_DIAMOND = ITEMS.register("super_diamond", SuperDiamond::new);
	public static final RegistryObject<Item> SUPER_DIAMOND_CHUNK = ITEMS.register("super_diamond_chunk", SuperDiamondChunk::new);
	public static final RegistryObject<Item> SUPER_DIAMOND_SMALL_CHUNK = ITEMS.register("super_diamond_small_chunk", SuperDiamondSmallChunk::new);
	
	
	
	/**
	 * Create new block items below
	 */
	public static final RegistryObject<Item> SILVER_BLOCK_ITEM = ITEMS.register("silver_block", () -> new BlockItem(RegistryHandlerBlocks.silver_block.get(), new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> AMETHYST_BLOCK_ITEM = ITEMS.register("amethyst_block", () -> new BlockItem(RegistryHandlerBlocks.AMETHYST_BLOCK.get(), new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> ORANGE_BLOCK_ITEM = ITEMS.register("orange_block", () -> new BlockItem(RegistryHandlerBlocks.ORANGE_BLOCK.get(), new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> SUPER_DIAMOND_BLOCK_ITEM = ITEMS.register("super_diamond_block", () -> new BlockItem(RegistryHandlerBlocks.SUPER_DIAMOND_BLOCK.get(), new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> LEAD_BLOCK_ITEM = ITEMS.register("lead_block", () -> new BlockItem(RegistryHandlerBlocks.LEAD_BLOCK.get(), new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> PLATINUM_BLOCK_ITEM = ITEMS.register("platinum_block", () -> new BlockItem(RegistryHandlerBlocks.PLATINUM_BLOCK.get(), new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> TITANIUM_BLOCK_ITEM = ITEMS.register("titanium_block", () -> new BlockItem(RegistryHandlerBlocks.TITANIUM_BLOCK.get(), new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> TIN_BLOCK_ITEM = ITEMS.register("tin_block", () -> new BlockItem(RegistryHandlerBlocks.TIN_BLOCK.get(), new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> NITRONIUM_BLOCK_ITEM = ITEMS.register("nitronium_block", () -> new BlockItem(RegistryHandlerBlocks.NITRONIUM_BLOCK.get(), new Item.Properties().group(RandomStuff.TAB)));
	
	
	/**
	 * Grass
	 */
	
	public static final RegistryObject<Item> ORANGE_GRASS_ITEM = ITEMS.register("orange_grass", () -> new BlockItem(RegistryHandlerBlocks.ORANGE_GRASS.get(), new Item.Properties().group(RandomStuff.TAB)));

	/**
	 * Create new ore block items
	 */
	
	public static final RegistryObject<Item> SILVER_ORE_ITEM = ITEMS.register("silver_ore", () -> new BlockItem(RegistryHandlerBlocks.SILVER_ORE.get(), new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> AMETHYST_ORE_ITEM = ITEMS.register("amethyst_ore", () -> new BlockItem(RegistryHandlerBlocks.AMATHYST_ORE.get(), new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> ORANGE_ORE_ITEM = ITEMS.register("orange_ore", () -> new BlockItem(RegistryHandlerBlocks.ORANGE_ORE.get(), new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> LEAD_ORE_ITEM = ITEMS.register("lead_ore", () -> new BlockItem(RegistryHandlerBlocks.LEAD_ORE.get(), new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> PLATINUM_ORE_ITEM = ITEMS.register("platinum_ore", () -> new BlockItem(RegistryHandlerBlocks.PLATINUM_ORE.get(), new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> TITANIUM_ORE_ITEM = ITEMS.register("titanium_ore", () -> new BlockItem(RegistryHandlerBlocks.TITANIUM_ORE.get(), new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> TIN_ORE_ITEM = ITEMS.register("tin_ore", () -> new BlockItem(RegistryHandlerBlocks.TIN_ORE.get(), new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> NITRONIUM_ORE_ITEM = ITEMS.register("nitronium_ore", () -> new BlockItem(RegistryHandlerBlocks.NITRONIUM_ORE.get(), new Item.Properties().group(RandomStuff.TAB)));
	
	/**
	 * Create new swords below
	 */
	
	public static final RegistryObject<Item> WATER_SWORD = ITEMS.register("water_sword", () -> new WaterSword(RandomStuffTier.TOOL_WATER , new Item.Properties()));
	public static final RegistryObject<Item> FIRE_SWORD = ITEMS.register("fire_sword", () -> new FireSword(RandomStuffTier.TOOL_FIRE, new Item.Properties()));
	
	/**
	 * Create new tools below
	 * NOTE: the X.Xf is attack speed!
	 */
	
	//Emerald tools and sword below
	public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword", () -> new EmeraldSword(RandomStuffTier.TOOL_EMERALD, 3, -1.0f, new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> EMERALD_PICK = ITEMS.register("emerald_pick", () -> new EmeraldPick(RandomStuffTier.TOOL_EMERALD, 1, -1.5f, new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> EMERALD_AXE = ITEMS.register("emerald_axe", () -> new EmeraldAxe(RandomStuffTier.TOOL_EMERALD, 2, -1.2f, new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> EMERALD_SHOVEL = ITEMS.register("emerald_shovel", () -> new EmeraldShovel(RandomStuffTier.TOOL_EMERALD, 0, -1.3f, new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> EMERALD_HOE = ITEMS.register("emerald_hoe", () -> new EmeraldHoe(RandomStuffTier.TOOL_EMERALD, 0, new Item.Properties().group(RandomStuff.TAB)));

	//Amethyst tools and sword
	public static final RegistryObject<Item> AMETHYST_SWORD = ITEMS.register("amethyst_sword", () -> new AmethystSword(RandomStuffTier.TOOL_AMETHYST, 1, -0.5f, new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> AMETHYST_PICK = ITEMS.register("amethyst_pick", () -> new AmethystPick(RandomStuffTier.TOOL_AMETHYST, 0, -1.0f, new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> AMETHYST_AXE = ITEMS.register("amethyst_axe", () -> new AmethystAxe(RandomStuffTier.TOOL_AMETHYST, 1, -1.0f, new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel", () -> new AmethystShovel(RandomStuffTier.TOOL_AMETHYST, 0, -1.0f, new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> AMETHYST_HOE = ITEMS.register("amethyst_hoe", () -> new AmethystHoe(RandomStuffTier.TOOL_AMETHYST, 0, new Item.Properties().group(RandomStuff.TAB)));
	
	//lead tools and sword
	public static final RegistryObject<Item> LEAD_SWORD = ITEMS.register("lead_sword", () -> new LeadSword(RandomStuffTier.TOOL_LEAD, -1, -2.4f, new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> LEAD_PICK = ITEMS.register("lead_pick", () -> new LeadPick(RandomStuffTier.TOOL_LEAD, -2, -3.0f, new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> LEAD_AXE = ITEMS.register("lead_axe", () -> new LeadAxe(RandomStuffTier.TOOL_LEAD, -2, -3.5f, new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> LEAD_SHOVEL = ITEMS.register("lead_shovel", () -> new LeadShovel(RandomStuffTier.TOOL_LEAD, -2, -3.0f, new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> LEAD_HOE = ITEMS.register("lead_hoe", () -> new LeadHoe(RandomStuffTier.TOOL_LEAD, 0, new Item.Properties().group(RandomStuff.TAB)));
	
	//nitronium tools and sword
	public static final RegistryObject<Item> NITRONIUM_SWORD = ITEMS.register("nitronium_sword", () -> new NitroniumSword(RandomStuffTier.TOOL_NITRONIUM, 6, 2.4f, new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> NITRONIUM_PICK = ITEMS.register("nitronium_pick", () -> new NitroniumPick(RandomStuffTier.TOOL_NITRONIUM, 4, 2.0f, new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> NITRONIUM_AXE = ITEMS.register("nitronium_axe", () -> new NitroniumAxe(RandomStuffTier.TOOL_NITRONIUM, 5, 2.1f, new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> NITRONIUM_SHOVEL = ITEMS.register("nitronium_shovel", () -> new NitroniumShovel(RandomStuffTier.TOOL_NITRONIUM, 3, 2.0f, new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> NITRONIUM_HOE = ITEMS.register("nitronium_hoe", () -> new NitroniumHoe(RandomStuffTier.TOOL_NITRONIUM, 0, new Item.Properties().group(RandomStuff.TAB)));

	//obsidian tools and sword
	public static final RegistryObject<Item> OBSIDIAN_SWORD = ITEMS.register("obsidian_sword", () -> new RandomSword(RandomStuffTier.TOOL_OBSIDIAN, 2, -2.0f, new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> OBSIDIAN_PICK = ITEMS.register("obsidian_pick", () -> new RandomPick(RandomStuffTier.TOOL_OBSIDIAN, 1, -2.2f, new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> OBSIDIAN_AXE = ITEMS.register("obsidian_axe", () -> new RandomAxe(RandomStuffTier.TOOL_OBSIDIAN, 1, -2.1f, new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> OBSIDIAN_SHOVEL = ITEMS.register("obsidian_shovel", () -> new RandomShovel(RandomStuffTier.TOOL_OBSIDIAN, 1, -2.0f, new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> OBSIDIAN_HOE = ITEMS.register("obsidian_hoe", () -> new RandomHoe(RandomStuffTier.TOOL_OBSIDIAN, 0, new Item.Properties().group(RandomStuff.TAB)));

	
	//orange tools and sword
	public static final RegistryObject<Item> ORANGE_SWORD = ITEMS.register("orange_sword", () -> new RandomSword(RandomStuffTier.TOOL_ORANGE, 0, -2.2f, new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> ORANGE_PICK = ITEMS.register("orange_pick", () -> new RandomPick(RandomStuffTier.TOOL_ORANGE, -1, -2.4f, new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> ORANGE_AXE = ITEMS.register("orange_axe", () -> new RandomAxe(RandomStuffTier.TOOL_ORANGE, -1, -2.4f, new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> ORANGE_SHOVEL = ITEMS.register("orange_shovel", () -> new RandomShovel(RandomStuffTier.TOOL_ORANGE, -1, -2.4f, new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> ORANGE_HOE = ITEMS.register("orange_hoe", () -> new RandomHoe(RandomStuffTier.TOOL_ORANGE, -2, new Item.Properties().group(RandomStuff.TAB)));

	
	//platinum tools and sword
	public static final RegistryObject<Item> PLATINUM_SWORD = ITEMS.register("platinum_sword", () -> new RandomSword(RandomStuffTier.TOOL_PLATINUM, 3, 0.5f, new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> PLATINUM_PICK = ITEMS.register("platinum_pick", () -> new RandomPick(RandomStuffTier.TOOL_PLATINUM, 2, 0.2f, new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> PLATINUM_AXE = ITEMS.register("platinum_axe", () -> new RandomAxe(RandomStuffTier.TOOL_PLATINUM, 2, 0.5f, new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> PLATINUM_SHOVEL = ITEMS.register("platinum_shovel", () -> new RandomShovel(RandomStuffTier.TOOL_PLATINUM, 1, 0.4f, new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> PLATINUM_HOE = ITEMS.register("platinum_hoe", () -> new RandomHoe(RandomStuffTier.TOOL_PLATINUM, 1, new Item.Properties().group(RandomStuff.TAB)));

	
	//condensed diamond tools and sword
	public static final RegistryObject<Item> CONDENSED_SWORD = ITEMS.register("condensed_sword", () -> new RandomSword(RandomStuffTier.TOOL_SUPER, 20, 6.5f, new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> CONDENSED_PICK = ITEMS.register("condensed_pick", () -> new RandomPick(RandomStuffTier.TOOL_SUPER, 20, 6.2f, new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> CONDENSED_AXE = ITEMS.register("condensed_axe", () -> new RandomAxe(RandomStuffTier.TOOL_SUPER, 20, 6.5f, new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> CONDENSED_SHOVEL = ITEMS.register("condensed_shovel", () -> new RandomShovel(RandomStuffTier.TOOL_SUPER, 20, 6.4f, new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> CONDENSED_HOE = ITEMS.register("condensed_hoe", () -> new RandomHoe(RandomStuffTier.TOOL_SUPER, 5, new Item.Properties().group(RandomStuff.TAB)));

	
	//silver tools and sword
	public static final RegistryObject<Item> SILVER_SWORD = ITEMS.register("silver_sword", () -> new RandomSword(RandomStuffTier.TOOL_SILVER, 0, -2.4f, new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> SILVER_PICK = ITEMS.register("silver_pick", () -> new RandomPick(RandomStuffTier.TOOL_SILVER, 0, -2.4f, new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> SILVER_AXE = ITEMS.register("silver_axe", () -> new RandomAxe(RandomStuffTier.TOOL_SILVER, 0, -2.4f, new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> SILVER_SHOVEL = ITEMS.register("silver_shovel", () -> new RandomShovel(RandomStuffTier.TOOL_SILVER, 0, -2.4f, new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> SILVER_HOE = ITEMS.register("silver_hoe", () -> new RandomHoe(RandomStuffTier.TOOL_SILVER, 1, new Item.Properties().group(RandomStuff.TAB)));
	
	
	//titanium tools and sword
	public static final RegistryObject<Item> TITANIUM_SWORD = ITEMS.register("titanium_sword", () -> new RandomSword(RandomStuffTier.TOOL_TITANIUM, 5, 2.8f, new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> TITANIUM_PICK = ITEMS.register("titanium_pick", () -> new RandomPick(RandomStuffTier.TOOL_TITANIUM, 3, 2.8f, new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> TITANIUM_AXE = ITEMS.register("titanium_axe", () -> new RandomAxe(RandomStuffTier.TOOL_TITANIUM, 4, 2.8f, new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> TITANIUM_SHOVEL = ITEMS.register("titanium_shovel", () -> new RandomShovel(RandomStuffTier.TOOL_TITANIUM, 3, 2.8f, new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> TITANIUM_HOE = ITEMS.register("titanium_hoe", () -> new RandomHoe(RandomStuffTier.TOOL_TITANIUM, 1, new Item.Properties().group(RandomStuff.TAB)));

	
	//tin tools and sword
	public static final RegistryObject<Item> TIN_SWORD = ITEMS.register("tin_sword", () -> new RandomSword(RandomStuffTier.TOOL_TIN, -3, -2.4f, new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> TIN_PICK = ITEMS.register("tin_pick", () -> new RandomPick(RandomStuffTier.TOOL_TIN, -4, -2.4f, new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> TIN_AXE = ITEMS.register("tin_axe", () -> new RandomAxe(RandomStuffTier.TOOL_TIN, -4, -2.4f, new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> TIN_SHOVEL = ITEMS.register("tin_shovel", () -> new RandomShovel(RandomStuffTier.TOOL_TIN, -3, -2.4f, new Item.Properties().group(RandomStuff.TAB)));
	public static final RegistryObject<Item> TIN_HOE = ITEMS.register("tin_hoe", () -> new RandomHoe(RandomStuffTier.TOOL_TIN, 1, new Item.Properties().group(RandomStuff.TAB)));

}





