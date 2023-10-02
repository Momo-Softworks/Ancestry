package com.momosoftworks.ancestry.core.lineage;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraftforge.common.MinecraftForge;

public class Feature
{
    private final Lineage lineage;

    public Feature(Lineage lineage)
    {
        this.lineage = lineage;
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onTick(TickEvent.PlayerTickEvent event)
    {

    }
}