package com.faidedtech.randomstuff.util;

import com.faidedtech.randomstuff.RandomStuff;
import com.faidedtech.randomstuff.blocks.SilverBlock;
import com.faidedtech.randomstuff.enums.RandomStuffTier;
import com.faidedtech.randomstuff.items.Amethyst;
import com.faidedtech.randomstuff.items.ItemBase;
import com.faidedtech.randomstuff.items.LeadIngot;
import com.faidedtech.randomstuff.items.NitroniumCrystal;
import com.faidedtech.randomstuff.items.NitroniumIngot;
import com.faidedtech.randomstuff.items.ObsidianIngot;
import com.faidedtech.randomstuff.items.OrangeIngot;
import com.faidedtech.randomstuff.items.PlatinumIngot;
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
	
	
	/**
	 * Create new swords below
	 */
	
	public static final RegistryObject<Item> WATER_SWORD = ITEMS.register("water_sword", () -> new WaterSword(RandomStuffTier.TOOL_WATER , new Item.Properties()));

}
