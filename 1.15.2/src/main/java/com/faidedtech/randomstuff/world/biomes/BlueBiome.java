package com.faidedtech.randomstuff.world.biomes;

import com.faidedtech.randomstuff.world.feature.OrangeTree;

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
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;

public class BlueBiome extends Biome {

	public BlueBiome(Builder biomeBuilder) {
		super(biomeBuilder);
		this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.CHICKEN, 50, 6, 8));
		this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.FOX, 25, 2, 4));
		this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.WOLF, 20, 5, 8));
		this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.PIG, 50, 5, 10));
		this.addCarver(GenerationStage.Carving.AIR, Biome.createCarver(WorldCarver.CAVE, new ProbabilityConfig(0.14285715F)));
		//this.addCarver(GenerationStage.Carving.AIR, Biome.createCarver(WorldCarver.CANYON, new ProbabilityConfig(0.01F)));
		
		DefaultBiomeFeatures.addOres(this);
		DefaultBiomeFeatures.addMonsterRooms(this);
		DefaultBiomeFeatures.addOakAndSpruceTrees(this);
		
		this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.NORMAL_TREE.withConfiguration(OrangeTree.ORANGE_TREE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(0, 0.1f, 1))));
		
		
		
	}
	
	public int getGrassColor(double x, double z) {
		return 0x005CB7;
	}
	
	
	
	public int getFoliageColor() {
		return 0x0984FF;
	}
	
	

}
