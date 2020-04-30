package com.faidedtech.randomstuff.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

/**
 * Class for the lead block
 * @author David Adams
 *
 */
public class LeadBlock extends Block {

	public LeadBlock() {
		super(Properties.create(Material.IRON, MaterialColor.IRON).sound(SoundType.METAL).hardnessAndResistance(2.0f));
	}

}
