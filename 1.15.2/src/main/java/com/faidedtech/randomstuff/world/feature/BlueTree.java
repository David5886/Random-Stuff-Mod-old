package com.faidedtech.randomstuff.world.feature;

import java.util.Random;
import java.util.Set;
import java.util.function.Function;

import com.mojang.datafixers.Dynamic;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.feature.AbstractSmallTreeFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;

public class BlueTree extends AbstractSmallTreeFeature<TreeFeatureConfig> {

	public BlueTree(Function<Dynamic<?>, ? extends TreeFeatureConfig> p_i225796_1_) {
		super(p_i225796_1_);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean func_225557_a_(IWorldGenerationReader p_225557_1_, Random p_225557_2_, BlockPos p_225557_3_,
			Set<BlockPos> p_225557_4_, Set<BlockPos> p_225557_5_, MutableBoundingBox p_225557_6_,
			TreeFeatureConfig p_225557_7_) {
		// TODO Auto-generated method stub
		return false;
	}

}
