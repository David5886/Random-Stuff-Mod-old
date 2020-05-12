package com.faidedtech.randomstuff.items;

import com.faidedtech.randomstuff.RandomStuff;

import net.minecraft.item.Item;

/**
 * Default Item Class
 * @author David Adams
 *
 */
public class DefaultItem extends Item {

	/**
	 * Default Constructor
	 * @param properties
	 */
	public DefaultItem(Properties prop) {
		super(prop.group(RandomStuff.TAB));
	}

}
