package com.faidedtech.randomstuff.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

/**
 * Class for the Amethyst ore block
 * @author David Adams
 *
 */
public class AmethystOre extends Block {

	public AmethystOre() {
		super(Properties.create(Material.ROCK, MaterialColor.STONE).sound(SoundType.STONE).hardnessAndResistance(1.5f));
	}

}
