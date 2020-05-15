package com.faidedtech.randomstuff.world.feature;

import java.util.Random;

import com.faidedtech.randomstuff.util.RegistryHandlerBlocks;

import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraftforge.common.IPlantable;

public class OrangeTree extends Tree {
	
	public static final TreeFeatureConfig ORANGE_TREE_CONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(RegistryHandlerBlocks.ORANGE_LOG.get().getDefaultState()), new SimpleBlockStateProvider(RegistryHandlerBlocks.ORANGE_LEAVES.get().getDefaultState()), new BlobFoliagePlacer(3, 0))).baseHeight(8).heightRandA(5).foliageHeight(3).ignoreVines().setSapling((IPlantable) RegistryHandlerBlocks.ORANGE_SAPLING.get()).build();

	@Override
	protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean b) {
		return Feature.NORMAL_TREE.withConfiguration(ORANGE_TREE_CONFIG);
	}

	
	
}
