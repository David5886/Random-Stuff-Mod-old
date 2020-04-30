package com.faidedtech.randomstuff.enums;

import java.util.function.Supplier;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;

/**
 * Armor material enum for the Random Stuff Mod
 * @author David Adams
 *
 */
public enum RandomStuffArmorMaterial implements IArmorMaterial {
	;
	
	private static final int[] MAX_DAMAGE_ARRAY = new int[] {13, 15, 16, 11}; //Change these if wanted
	private final String name;
	private final int durability;
	private final int[] damageReduction;
	private final int enchantability;
	private final SoundEvent equipSound;
	private final float toughness;
	private final Supplier<Ingredient> repairMaterial;
	
	RandomStuffArmorMaterial(String name, int durability, int damageReduction[], int enchantability, SoundEvent sound, float toughness, Supplier<Ingredient> repairMaterial) {
		this.name = name;
		this.durability = durability;
		this.damageReduction = damageReduction;
		this.enchantability = enchantability;
		this.equipSound = sound;
		this.toughness = toughness;
		this.repairMaterial = repairMaterial;
	}

	@Override
	public int getDurability(EquipmentSlotType slotIn) {
		// TODO Auto-generated method stub
		return durability;
	}

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slotIn) {
		// TODO Auto-generated method stub
		return damageReduction[slotIn.getIndex()];
	}

	@Override
	public int getEnchantability() {
		// TODO Auto-generated method stub
		return enchantability;
	}

	@Override
	public SoundEvent getSoundEvent() {
		// TODO Auto-generated method stub
		return equipSound;
	}

	@Override
	public Ingredient getRepairMaterial() {
		// TODO Auto-generated method stub
		return repairMaterial.get();
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public float getToughness() {
		// TODO Auto-generated method stub
		return toughness;
	}

}
