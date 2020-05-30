package com.faidedtech.randomstuff.world.dimension;

import java.util.Random;
import java.util.Set;

import com.faidedtech.randomstuff.util.BiomeInit;
import com.google.common.collect.ImmutableSet;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.biome.provider.BiomeProvider;

public class BlueBiomeProvider extends BiomeProvider {
	
	private Random rand;

	public BlueBiomeProvider() {
		super(biomeList);
		rand = new Random();
	}
	
	private static final Set<Biome> biomeList = ImmutableSet.of(Biomes.PLAINS, BiomeInit.ORANGE_BIOME.get(), Biomes.RIVER, Biomes.OCEAN);

	@Override
	public Biome getNoiseBiome(int x, int y, int z) {
//		return BiomeInit.BLUE_BIOME.get();
		return BiomeInit.CEDAR_FOREST_HILL.get();
		//return Biomes.PLAINS;
	}

}
