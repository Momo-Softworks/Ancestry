package com.momosoftworks.ancestry;

import com.momosoftworks.ancestry.example.ClojureExample;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = Ancestry.MOD_ID, version = Ancestry.VERSION)
public class Ancestry {
    public static final String MOD_ID = "ancestry";
    public static final String VERSION = "1.0";

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        //regEventHandler(new ClojureExample());
    }

    void regEventHandler(Object eventHandler)
    {   MinecraftForge.EVENT_BUS.register(eventHandler);
        FMLCommonHandler.instance().bus().register(eventHandler);
    }
}