package com.faidedtech.randomstuff.util;

import com.faidedtech.randomstuff.RandomStuff;
import com.faidedtech.randomstuff.blocks.AmethystBlock;
import com.faidedtech.randomstuff.blocks.AmethystOre;
import com.faidedtech.randomstuff.blocks.LeadBlock;
import com.faidedtech.randomstuff.blocks.LeadOre;
import com.faidedtech.randomstuff.blocks.NitroniumBlock;
import com.faidedtech.randomstuff.blocks.NitroniumOre;
import com.faidedtech.randomstuff.blocks.OrangeBlock;
import com.faidedtech.randomstuff.blocks.OrangeOre;
import com.faidedtech.randomstuff.blocks.PlatinumBlock;
import com.faidedtech.randomstuff.blocks.PlatinumOre;
import com.faidedtech.randomstuff.blocks.SilverBlock;
import com.faidedtech.randomstuff.blocks.SilverOre;
import com.faidedtech.randomstuff.blocks.SuperDiamondBlock;
import com.faidedtech.randomstuff.blocks.TinBlock;
import com.faidedtech.randomstuff.blocks.TinOre;
import com.faidedtech.randomstuff.blocks.TitaniumBlock;
import com.faidedtech.randomstuff.blocks.TitaniumOre;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Registry Handler for blocks
 * @author David Adams
 *
 */
public class RegistryHandlerBlocks {
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, RandomStuff.MODID);
	
	public static void init() {
		BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

	}
	
	/**
	 * Register new blocks below:
	 */
	
	//Blocks
	public static final RegistryObject<Block> silver_block = BLOCKS.register("silver_block", () -> new SilverBlock());
	public static final RegistryObject<Block> AMETHYST_BLOCK = BLOCKS.register("amethyst_block", () -> new AmethystBlock());
	public static final RegistryObject<Block> ORANGE_BLOCK = BLOCKS.register("orange_block", () -> new OrangeBlock());
	public static final RegistryObject<Block> SUPER_DIAMOND_BLOCK = BLOCKS.register("super_diamond_block", () -> new SuperDiamondBlock());
	public static final RegistryObject<Block> LEAD_BLOCK = BLOCKS.register("lead_block", () -> new LeadBlock());
	public static final RegistryObject<Block> PLATINUM_BLOCK = BLOCKS.register("platinum_block", () -> new PlatinumBlock());
	public static final RegistryObject<Block> TITANIUM_BLOCK = BLOCKS.register("titanium_block", () -> new TitaniumBlock());
	public static final RegistryObject<Block> TIN_BLOCK = BLOCKS.register("tin_block", () -> new TinBlock());
	public static final RegistryObject<Block> NITRONIUM_BLOCK = BLOCKS.register("nitronium_block", () -> new NitroniumBlock());

	//Ore Blocks
	public static final RegistryObject<Block> SILVER_ORE = BLOCKS.register("silver_ore", () -> new SilverOre());
	public static final RegistryObject<Block> AMATHYST_ORE = BLOCKS.register("amethyst_ore", () -> new AmethystOre());
	public static final RegistryObject<Block> ORANGE_ORE = BLOCKS.register("orange_ore", () -> new OrangeOre());
	public static final RegistryObject<Block> LEAD_ORE = BLOCKS.register("lead_ore", () -> new LeadOre());
	public static final RegistryObject<Block> PLATINUM_ORE = BLOCKS.register("platinum_ore", () -> new PlatinumOre());
	public static final RegistryObject<Block> TITANIUM_ORE = BLOCKS.register("titanium_ore", () -> new TitaniumOre());
	public static final RegistryObject<Block> TIN_ORE = BLOCKS.register("tin_ore", () -> new TinOre());
	public static final RegistryObject<Block> NITRONIUM_ORE = BLOCKS.register("nitronium_ore", () -> new NitroniumOre());
	
}
