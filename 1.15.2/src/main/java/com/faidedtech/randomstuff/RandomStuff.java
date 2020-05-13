package com.faidedtech.randomstuff;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.faidedtech.randomstuff.util.BiomeInit;
import com.faidedtech.randomstuff.util.DimensionInit;
import com.faidedtech.randomstuff.util.RegistryHandler;
import com.faidedtech.randomstuff.util.RegistryHandlerBlocks;
import com.faidedtech.randomstuff.world.gen.AmethystOreGen;
import com.faidedtech.randomstuff.world.gen.LeadOreGen;
import com.faidedtech.randomstuff.world.gen.NitroniumOreGen;
import com.faidedtech.randomstuff.world.gen.OrangeOreGen;
import com.faidedtech.randomstuff.world.gen.PlatinumOreGen;
import com.faidedtech.randomstuff.world.gen.RandomOreGen;
import com.faidedtech.randomstuff.world.gen.SilverOreGen;
import com.faidedtech.randomstuff.world.gen.TinOreGen;
import com.faidedtech.randomstuff.world.gen.TitaniumOreGen;

import java.util.stream.Collectors;

/**
 * Main class for the Random Stuff Mod for Minecraft v1.15.2
 * @author David Adams
 * @version 0.1b
 *
 */

// The value here should match an entry in the META-INF/mods.toml file
@Mod("randomstuff")
@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class RandomStuff
{
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "randomstuff";
    public static final String NAME = "Random Stuff Mod";
    public static final String VERSION = "0.1b";
    public static final ResourceLocation BLUE_DIM_TYPE = new ResourceLocation(MODID, "blue");


    /**
     * Default Constructor for the mod
     */
    public RandomStuff() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        
        //Initialize items and blocks into the game
        RegistryHandler.init();
        RegistryHandlerBlocks.init();
        BiomeInit.init();
        DimensionInit.init();

        // Register ourselves for server and other game events we are interested in

        MinecraftForge.EVENT_BUS.register(this);
        
    }
    
    @SubscribeEvent
    public static void onRegisterBiomes(final RegistryEvent.Register<Biome> event) {
    	BiomeInit.registerBiomes();
    }
    
   

    /**
     * Code that runs during game setup, outputs to the console at startup
     * @param event
     */

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
        
        
    }

    /**
     * Code that is only ran on the client side of the game. Code here does not run on the server side
     * @param event
     */
    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
        LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().gameSettings);
    }
    
    public static final ItemGroup TAB = new ItemGroup("randomTab") {
    	
    	@Override
    	public ItemStack createIcon() {
    		return new ItemStack(RegistryHandler.WATER_SWORD.get());
    	}
    };

   
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("HELLO from server starting");
    }
    
    @SubscribeEvent
    public static void loadCompleteEvent(FMLLoadCompleteEvent event) {
    	//RandomOreGen.generateOre();
    	TinOreGen.generateOre();
    	LeadOreGen.generateOre();
    	SilverOreGen.generateOre();
    	AmethystOreGen.generateOre();
    	OrangeOreGen.generateOre();
    	PlatinumOreGen.generateOre();
    	TitaniumOreGen.generateOre();
    	NitroniumOreGen.generateOre();
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            // register a new block here
            LOGGER.info("HELLO from Register Block");
        }
    }
    
}
