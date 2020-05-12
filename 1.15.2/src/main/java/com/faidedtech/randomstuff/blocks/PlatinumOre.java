package com.faidedtech.randomstuff.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

/**
 * Class for the lead ore block
 * @author David Adams
 *
 */
public class PlatinumOre extends Block {

	public PlatinumOre() {
		super(Properties.create(Material.ROCK, MaterialColor.STONE).sound(SoundType.STONE).hardnessAndResistance(3.0f));
	}

}
