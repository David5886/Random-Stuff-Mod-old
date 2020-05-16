package com.faidedtech.randomstuff.enums;

import java.util.function.Supplier;
import com.faidedtech.randomstuff.RandomStuff;
import com.faidedtech.randomstuff.util.RegistryHandler;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.item.*;

/**
 * Armor material enum for the Random Stuff Mod
 * @author David Adams
 *
 */
public enum RandomStuffArmorMaterial implements IArmorMaterial {
	EMERALD(RandomStuff.MODID + ":emerald", 5, new int[] { 5, 9, 8, 5 }, 30, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 7.0F, () -> {
		return Ingredient.fromItems(Items.EMERALD);
	}),
	SILVER(RandomStuff.MODID + ":silver", 4, new int[] { 4, 7, 6, 3 }, 25, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 6.0F, () -> {
		return Ingredient.fromItems(RegistryHandler.SILVER_INGOT.get());
	}),
	OBSIDIAN(RandomStuff.MODID + ":obsidian", 5, new int[] { 5, 8, 7, 5 }, 35, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 7.0F, () -> {
		return Ingredient.fromItems(RegistryHandler.OBSIDIAN_INGOT.get());
	}),
	ORANGE(RandomStuff.MODID + ":orange", 5, new int[] { 6, 10, 9, 7 }, 38, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 7.5F, () -> {
		return Ingredient.fromItems(RegistryHandler.ORANGE_INGOT.get());
	}),
	PLATINUM(RandomStuff.MODID + ":platinum", 8, new int[] { 10, 18, 16, 10 }, 45, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 9.5F, () -> {
		return Ingredient.fromItems(RegistryHandler.PLATINUM_INGOT.get());
	}),
	TITANIUM(RandomStuff.MODID + ":titanium", 9, new int[] { 12, 20, 18, 13 }, 60, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 10.5F, () -> {
		return Ingredient.fromItems(RegistryHandler.TITANIUM_INGOT.get());
	}),
	NITRONIUM(RandomStuff.MODID + ":nitronium", 12, new int[] { 14, 24, 22, 16 }, 75, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 12.5F, () -> {
		return Ingredient.fromItems(Items.EMERALD);
	}),
	CDIAMOND(RandomStuff.MODID + ":condenseddiamond", 15, new int[] { 20, 34, 32, 26 }, 90, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 15.5F, () -> {
		return Ingredient.fromItems(RegistryHandler.SUPER_DIAMOND.get());
	});
	
	
	private static final int[] MAX_DAMAGE_ARRAY = new int[] {17, 20, 21, 16}; //Change these if wanted
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
