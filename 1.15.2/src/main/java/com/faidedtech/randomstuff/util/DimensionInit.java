package com.faidedtech.randomstuff.util;

import com.faidedtech.randomstuff.RandomStuff;
import com.faidedtech.randomstuff.world.dimension.BlueModDimension;

import net.minecraftforge.common.ModDimension;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class DimensionInit {

	public static final DeferredRegister<ModDimension> MOD_DIMENSION = new DeferredRegister<>(ForgeRegistries.MOD_DIMENSIONS, RandomStuff.MODID);
	
	public static final RegistryObject<ModDimension> BLUE_DIM = MOD_DIMENSION.register("blue_dimension", () -> new BlueModDimension());
	
	public static void init() {
		MOD_DIMENSION.register(FMLJavaModLoadingContext.get().getModEventBus());
		//entities.register and so on and so fourth
	}
}
