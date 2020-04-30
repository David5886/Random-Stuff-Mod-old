package com.faidedtech.randomstuff.util;

import com.faidedtech.randomstuff.RandomStuff;
import com.faidedtech.randomstuff.blocks.AmethystBlock;
import com.faidedtech.randomstuff.blocks.LeadBlock;
import com.faidedtech.randomstuff.blocks.OrangeBlock;
import com.faidedtech.randomstuff.blocks.SilverBlock;
import com.faidedtech.randomstuff.blocks.SuperDiamondBlock;

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
	
	public static final RegistryObject<Block> silver_block = BLOCKS.register("silver_block", () -> new SilverBlock());
	public static final RegistryObject<Block> AMETHYST_BLOCK = BLOCKS.register("amethyst_block", () -> new AmethystBlock());
	public static final RegistryObject<Block> ORANGE_BLOCK = BLOCKS.register("orange_block", () -> new OrangeBlock());
	public static final RegistryObject<Block> SUPER_DIAMOND_BLOCK = BLOCKS.register("super_diamond_block", () -> new SuperDiamondBlock());
	public static final RegistryObject<Block> LEAD_BLOCK = BLOCKS.register("lead_block", () -> new LeadBlock());

}
