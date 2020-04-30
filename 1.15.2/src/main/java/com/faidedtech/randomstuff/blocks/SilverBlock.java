package com.faidedtech.randomstuff.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class SilverBlock extends Block {

	public SilverBlock() {
		super(Properties.create(Material.IRON, MaterialColor.IRON).sound(SoundType.METAL).hardnessAndResistance(2.0f));
		//setRegistryName("silverBlock");
	}

}
