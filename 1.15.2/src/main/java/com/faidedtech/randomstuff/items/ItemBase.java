package com.faidedtech.randomstuff.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item{

	/**
	 * Default Constructor
	 * @param properties
	 */
	public ItemBase() {
		super(new Item.Properties().group(ItemGroup.MATERIALS));
	}

}
