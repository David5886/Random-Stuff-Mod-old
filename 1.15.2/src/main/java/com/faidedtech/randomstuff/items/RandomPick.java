package com.faidedtech.randomstuff.items;


import net.minecraft.item.IItemTier;
import net.minecraft.item.PickaxeItem;
/**
 * default Class for the random pick
 * @author David Adams
 * 
 */

public class RandomPick extends PickaxeItem {
	
	//tier is the material tier, attackDamageIn

	public RandomPick(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
		super(tier, attackDamageIn, attackSpeedIn, builder);
		// TODO Auto-generated constructor stub
	}

}
