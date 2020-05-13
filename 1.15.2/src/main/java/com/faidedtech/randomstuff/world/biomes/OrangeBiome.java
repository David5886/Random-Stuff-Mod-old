package com.faidedtech.randomstuff.world.biomes;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.GrassColors;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.carver.WorldCarver;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.ProbabilityConfig;

public class OrangeBiome extends Biome {

	public OrangeBiome(Builder biomeBuilder) {
		super(biomeBuilder);
		this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.CAT, 10, 3, 5));
		this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.PIG, 50, 5, 10));
		this.addCarver(GenerationStage.Carving.AIR, Biome.createCarver(WorldCarver.CAVE, new ProbabilityConfig(0.14285715F)));
		this.addCarver(GenerationStage.Carving.AIR, Biome.createCarver(WorldCarver.CANYON, new ProbabilityConfig(0.01F)));
		
		DefaultBiomeFeatures.addOres(this);
		DefaultBiomeFeatures.addMonsterRooms(this);
		DefaultBiomeFeatures.addSparseOakTrees(this);
		
		
		
	}
	
	public int getGrassColor(double x, double z) {
		return 0x97342A;
	}
	
	
	
	public int getFoliageColor() {
		return 0x97342a;
	}
	
	

}