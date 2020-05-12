package com.faidedtech.randomstuff.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

/**
 * Class for the titanium ore block
 * @author David Adams
 *
 */
public class TitaniumOre extends Block {

	public TitaniumOre() {
		super(Properties.create(Material.ROCK, MaterialColor.STONE).sound(SoundType.STONE).hardnessAndResistance(3.0f));
	}

}
