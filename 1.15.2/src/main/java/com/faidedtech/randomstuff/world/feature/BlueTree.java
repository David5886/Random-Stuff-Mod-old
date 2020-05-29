package com.faidedtech.randomstuff.world.feature;

import java.util.Random;

import com.faidedtech.randomstuff.util.RegistryHandlerBlocks;

import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.foliageplacer.SpruceFoliagePlacer;
import net.minecraftforge.common.IPlantable;

public class BlueTree extends Tree {

	public static final TreeFeatureConfig BLUE_TREE_CONFIG = (new TreeFeatureConfig.Builder(
			new SimpleBlockStateProvider(RegistryHandlerBlocks.BLUE_LOG.get().getDefaultState()),
			new SimpleBlockStateProvider(RegistryHandlerBlocks.BLUE_LEAVES.get().getDefaultState()),
			new SpruceFoliagePlacer(3, 1))).baseHeight(8).heightRandA(35).trunkTopOffset(0).foliageHeight(16).ignoreVines()
					.setSapling((IPlantable) RegistryHandlerBlocks.BLUE_SAPLING.get()).build();

	@Override
	protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean b) {
		return Feature.NORMAL_TREE.withConfiguration(BLUE_TREE_CONFIG);
	}
}