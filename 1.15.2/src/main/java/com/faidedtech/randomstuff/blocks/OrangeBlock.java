package com.faidedtech.randomstuff.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

/**
 * Class for the Orange block
 * @author David Adams
 *
 */
public class OrangeBlock extends Block {

	public OrangeBlock() {
		super(Properties.create(Material.IRON, MaterialColor.IRON).sound(SoundType.METAL).hardnessAndResistance(2.0f));
	}

}
