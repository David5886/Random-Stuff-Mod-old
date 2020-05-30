package com.faidedtech.randomstuff.world.biomes;

import com.faidedtech.randomstuff.world.feature.BlueTree;
import com.faidedtech.randomstuff.world.feature.CedarTree;

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

/**
 * Class for the blue biome and the bluebiome sub biomes.
 * @author David Adams
 *
 */
public class CedarBiome extends Biome {

	public CedarBiome(Builder biomeBuilder) {
		super(biomeBuilder);
		//this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.CHICKEN, 50, 6, 8));
		this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.FOX, 25, 2, 4));
		this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.WOLF, 20, 5, 8));
		this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.ENDERMAN, 5, 1, 1));
		this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.HORSE, 10, 5, 6));
		//this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.PIG, 50, 5, 10));
		this.addCarver(GenerationStage.Carving.AIR, Biome.createCarver(WorldCarver.CAVE, new ProbabilityConfig(0.14285715F)));
		//this.addCarver(GenerationStage.Carving.AIR, Biome.createCarver(WorldCarver.CANYON, new ProbabilityConfig(0.01F)));
		
		DefaultBiomeFeatures.addOres(this);
		DefaultBiomeFeatures.addMonsterRooms(this);
		DefaultBiomeFeatures.addScatteredOakAndSpruceTrees(this);
		DefaultBiomeFeatures.addScatteredSpruceTrees(this);
		DefaultBiomeFeatures.addMushrooms(this);
		DefaultBiomeFeatures.addGrassAndDeadBushes(this);
		DefaultBiomeFeatures.addBerryBushes(this);
		DefaultBiomeFeatures.addTaigaLargeFerns(this);
		DefaultBiomeFeatures.addTaigaGrassAndMushrooms(this);
		DefaultBiomeFeatures.addExtraGoldOre(this);
		
		this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.NORMAL_TREE.withConfiguration(CedarTree.CEDAR_TREE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.7f, 6))));
		
		
		
	}
	
	public int getGrassColor(double x, double z) {
		return 0x006600;
	}
	
	
	
	public int getFoliageColor() {
		return 0x006600;
	}
	
	

}
