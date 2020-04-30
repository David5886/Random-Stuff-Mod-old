package com.faidedtech.randomstuff.items;

import com.faidedtech.randomstuff.RandomStuff;

import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.NonNullList;

/**
 * Class for a new water sword
 * @author David Adams
 *
 */

public class WaterSword extends SwordItem {

	public WaterSword(IItemTier material, Properties prop) {
		//material, maxDamage, attackDamage, properties
		super(material, 3, -2.4f, prop.group(RandomStuff.TAB));
	}
	
	public void fillItemGroup(ItemGroup tab, NonNullList<ItemStack> list) {
		if(isInGroup(tab)) {
			ItemStack istack = new ItemStack(this);
			istack.addEnchantment(Enchantments.SWEEPING, 3);
			list.add(istack);
		}
	}

}
