package com.faidedtech.randomstuff.items;


import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.util.NonNullList;
/**
 * Class for the lead pick
 * @author David Adams
 * \\I know I don't have to create this class, but doing so for future plans//
 */

public class LeadPick extends PickaxeItem {
	
	//tier is the material tier, attackDamageIn

	public LeadPick(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
		super(tier, attackDamageIn, attackSpeedIn, builder);
		// TODO Auto-generated constructor stub
	}
	
	public void fillItemGroup(ItemGroup tab, NonNullList<ItemStack> list) {
		if(isInGroup(tab)) {
			ItemStack istack = new ItemStack(this);
			istack.addEnchantment(Enchantments.KNOCKBACK, 3);
			list.add(istack);
		}
	}

}
