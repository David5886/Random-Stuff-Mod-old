package com.faidedtech.randomstuff;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * RandomStuff: Main class for the Random Stuff Mod for Minecraft v. 1.15.2
 * @author David Adams
 *
 */

@Mod("randomStuff2")
public final class RandomStuff {
	
	public static final String MODID = "randomStuff2";
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	
	
	/**
	 * Default Constructor:
	 */
	public RandomStuff() {
		Items.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
}
