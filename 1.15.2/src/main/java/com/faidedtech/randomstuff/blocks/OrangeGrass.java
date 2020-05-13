package com.faidedtech.randomstuff.blocks;

import net.minecraft.block.GrassBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block.Properties;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class OrangeGrass extends GrassBlock {

	public OrangeGrass() {
		super(Properties.create(Material.EARTH, MaterialColor.GRASS).sound(SoundType.PLANT).hardnessAndResistance(0.5f));
		// TODO Auto-generated constructor stub
	}
	

}
