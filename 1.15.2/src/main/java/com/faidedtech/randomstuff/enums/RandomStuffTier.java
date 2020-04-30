package com.faidedtech.randomstuff.enums;

import java.util.function.Supplier;

import com.faidedtech.randomstuff.util.RegistryHandler;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.block.*;
import net.minecraft.item.*;

/**
 * Enum class for tool materials for the Random Stuff mod
 * @author David Adams
 *
 */

public enum RandomStuffTier implements IItemTier {
	//Add new materials below:
	TOOL_WATER(3, 10, 5.5F, 2, 15, () -> Ingredient.EMPTY),
	TOOL_SILVER(2, 300, 7.0F, 2, 15, () -> Ingredient.fromItems(RegistryHandler.SILVER_INGOT.get())),
	TOOL_OBSIDIAN(6, 1800, 10.0F, 4, 15, () -> Ingredient.fromItems(RegistryHandler.OBSIDIAN_INGOT.get())),
	TOOL_AMETHYST(2, 250, 5.0F, 1, 10, () -> Ingredient.fromItems(RegistryHandler.AMETHYST.get())),
	TOOL_FIRE(3, 1500, 8.5F, 2, 19, () -> Ingredient.EMPTY),
	TOOL_EMERALD(5, 2500, 10.5F, 5, 30, () -> Ingredient.fromItems(Items.EMERALD)),
	TOOL_ORANGE(4, 1800, 8.5F, 5, 30, () -> Ingredient.fromItems(RegistryHandler.ORANGE_INGOT.get())),
	TOOL_LEAD(2, 250, 5.0F, 2, 12, () -> Ingredient.fromItems(RegistryHandler.LEAD_INGOT.get())),
	TOOL_PLATINUM(8, 5000, 11.0F, 8, 20, () -> Ingredient.fromItems(RegistryHandler.PLATINUM_INGOT.get())),
	TOOL_TITANIUM(7, 1000, 8.0F, 8, 16, () -> Ingredient.fromItems(RegistryHandler.TITANIUM_INGOT.get())),
	TOOL_TIN(6, 100, 5.0F, 5, 12, () -> Ingredient.fromItems(RegistryHandler.TIN_INGOT.get()))
	
	//TODO add other mod materials here:
	;
	
	private final int harvestLevel;
	private final int maxUses;
	private final float efficiency;
	private final float damage;
	private final int enchantability;
	private final Supplier<Ingredient> repairMaterial;
	
	
	/**
	 * Default Constructor: Creates the new material tier for use with items and swords
	 * @param harvestLevel
	 * @param maxUses
	 * @param efficiency
	 * @param damage
	 * @param enchantability
	 * @param repairMaterial
	 */
	RandomStuffTier(int harvestLevel, int maxUses, float efficiency, float damage, int enchantability, Supplier<Ingredient> repairMaterial) {
		this.harvestLevel = harvestLevel;
		this.maxUses = maxUses;
		this.efficiency = efficiency;
		this.damage = damage;
		this.enchantability = enchantability;
		this.repairMaterial = repairMaterial;
		
	}

	@Override
	public int getMaxUses() {
		return maxUses;
	}

	@Override
	public float getEfficiency() {
		return efficiency;
	}

	@Override
	public float getAttackDamage() {
		return damage;
	}

	@Override
	public int getHarvestLevel() {
		return harvestLevel;
	}

	@Override
	public int getEnchantability() {
		return enchantability;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return repairMaterial.get();
	}

}
