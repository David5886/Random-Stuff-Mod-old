package com.faidedtech.randomstuff.util;

import com.faidedtech.randomstuff.RandomStuff;
import com.faidedtech.randomstuff.blocks.SilverBlock;
import com.faidedtech.randomstuff.items.ItemBase;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
	
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, RandomStuff.MODID);

	/**
	 * Initialize items
	 */
	public static void init() {
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		//BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
		//entities.register and so on and so fourth
	}
	
	
	/**
	 * Create new items below
	 */
	public static final RegistryObject<Item> ITEM_NAME = ITEMS.register("debug", ItemBase::new); //template for new items
	
	
	
	/**
	 * Create new blocks below
	 */
	
}
