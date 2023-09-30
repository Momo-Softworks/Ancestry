package com.momosoftworks.ancestry.example;
import com.momosoftworks.ancestry.CLJ;
import cpw.mods.fml.common.gameevent.TickEvent;

public class ClojureExample
{
    static final CLJ.Namespace EXAMPLE_CLOJURE = CLJ.getNamespace("com.momosoftworks.ancestry.example.Example");

    //@SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event)
    {   EXAMPLE_CLOJURE.func("on-player-tick", event);
    }
}