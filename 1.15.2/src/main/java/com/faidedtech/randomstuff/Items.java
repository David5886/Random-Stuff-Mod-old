package com.faidedtech.randomstuff;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Items {
	
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, RandomStuff.MODID);
	
	public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("Test_Item", () -> new Item(new Item.Properties()));
	
	Items() {
		
	}

}
