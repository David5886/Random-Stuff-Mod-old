package com.faidedtech.randomstuff.util;

import com.faidedtech.randomstuff.RandomStuff;

import net.minecraft.world.dimension.DimensionType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.event.world.RegisterDimensionsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;;

@Mod.EventBusSubscriber(modid = RandomStuff.MODID, bus = Bus.FORGE)
public class ForgeEventBusSubscriber {

	@SubscribeEvent
	public static void registerDimensions(final RegisterDimensionsEvent event) {
		if(DimensionType.byName(RandomStuff.BLUE_DIM_TYPE) == null) {
			DimensionManager.registerDimension(RandomStuff.BLUE_DIM_TYPE, DimensionInit.BLUE_DIM.get(), null, true);
		}
		RandomStuff.LOGGER.info("Dimensions Registered!");
	}
}
