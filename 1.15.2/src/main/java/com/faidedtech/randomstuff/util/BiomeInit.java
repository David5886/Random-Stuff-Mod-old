package com.faidedtech.randomstuff.util;

import com.faidedtech.randomstuff.RandomStuff;
import com.faidedtech.randomstuff.world.biomes.BlueBiome;
import com.faidedtech.randomstuff.world.biomes.CedarBiome;
import com.faidedtech.randomstuff.world.biomes.OrangeBiome;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.biome.Biome.RainType;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BiomeInit {
	public static final DeferredRegister<Biome> BIOMES = new DeferredRegister<>(ForgeRegistries.BIOMES, RandomStuff.MODID);
	
	public static final RegistryObject<Biome> ORANGE_BIOME = BIOMES.register("orange_biome", () -> new OrangeBiome(new Biome.Builder().precipitation(RainType.RAIN).scale(0.05f).temperature(0.5f).waterColor(7479552).waterFogColor(9324071).surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(/*Top*/Blocks.GRASS_BLOCK.getDefaultState(), /*Below top*/Blocks.DIRT.getDefaultState(), /*underwater block*/Blocks.DIRT.getDefaultState())).category(Category.FOREST).downfall(0.05f).depth(0.02f).parent(null)));
	public static final RegistryObject<Biome> BLUE_BIOME = BIOMES.register("blue_biome", () -> new BlueBiome(new Biome.Builder().precipitation(RainType.RAIN).scale(0.0f).temperature(0.5f).waterColor(0x44AFF5).waterFogColor(0x44AFF5).surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(Blocks.GRASS_BLOCK.getDefaultState(), Blocks.DIRT.getDefaultState(), Blocks.DIRT.getDefaultState())).category(Category.FOREST).downfall(0.05f).depth(0.02f).parent(null)));
	public static final RegistryObject<Biome> BLUE_BIOME_HILL = BIOMES.register("blue_biome_hill", () -> new BlueBiome(new Biome.Builder().precipitation(RainType.RAIN).scale(0.5f).temperature(0.2f).waterColor(0x44AFF5).waterFogColor(0x44AFF5).surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(Blocks.GRASS_BLOCK.getDefaultState(), Blocks.DIRT.getDefaultState(), Blocks.DIRT.getDefaultState())).category(Category.FOREST).downfall(0.03f).depth(1.0f).parent(null)));
	public static final RegistryObject<Biome> CEDAR_FOREST = BIOMES.register("cedar_forest", () -> new CedarBiome(new Biome.Builder().precipitation(RainType.RAIN).scale(0.0f).temperature(0.5f).waterColor(0x44AFF5).waterFogColor(0x44AFF5).surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(Blocks.GRASS_BLOCK.getDefaultState(), Blocks.DIRT.getDefaultState(), Blocks.DIRT.getDefaultState())).category(Category.FOREST).downfall(0.05f).depth(0.02f).parent(null)));
	public static final RegistryObject<Biome> CEDAR_FOREST_HILL = BIOMES.register("cedar_forest_hill", () -> new CedarBiome(new Biome.Builder().precipitation(RainType.RAIN).scale(0.5f).temperature(0.2f).waterColor(0x44AFF5).waterFogColor(0x44AFF5).surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(Blocks.GRASS_BLOCK.getDefaultState(), Blocks.DIRT.getDefaultState(), Blocks.DIRT.getDefaultState())).category(Category.FOREST).downfall(0.03f).depth(1.0f).parent(null)));

	
	public static void init() {
		BIOMES.register(FMLJavaModLoadingContext.get().getModEventBus());
		//entities.register and so on and so fourth
	}
	
	public static void registerBiomes() {
		registerBiome(ORANGE_BIOME.get(), Type.FOREST, Type.OVERWORLD);
		registerBiome(BLUE_BIOME.get(), Type.FOREST, Type.OVERWORLD);
		registerBiome(BLUE_BIOME_HILL.get(), Type.MOUNTAIN, Type.OVERWORLD);
		registerBiome(CEDAR_FOREST.get(), Type.FOREST, Type.OVERWORLD);
		registerBiome(CEDAR_FOREST_HILL.get(), Type.FOREST, Type.OVERWORLD);
		
	}
	
	private static void registerBiome(Biome biome, Type... types) {
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addSpawnBiome(biome);
		BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(biome, 10));
		
	}
}
