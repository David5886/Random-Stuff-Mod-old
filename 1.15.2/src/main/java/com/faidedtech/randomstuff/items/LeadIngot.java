package com.faidedtech.randomstuff.items;

import com.faidedtech.randomstuff.RandomStuff;

import net.minecraft.item.Item;

/**
 * Item class for the lead ingot
 * @author David Adams
 *
 */
public class LeadIngot extends Item {

	/**
	 * Default Constructor
	 * @param properties
	 */
	public LeadIngot() {
		super(new Item.Properties().group(RandomStuff.TAB));
	}

}
