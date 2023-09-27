package com.example.examplemod;

import clojure.java.api.Clojure;
import clojure.lang.IFn;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod {
    public static final String MODID = "examplemod";
    public static final String VERSION = "1.0";

    @EventHandler
    public void init(FMLInitializationEvent event) {
        // Print the classpath for debugging
        System.out.println("Classpath: " + System.getProperty("java.class.path"));

        // Initialize Clojure
        IFn requireClojure = Clojure.var("clojure.core", "require");
        requireClojure.invoke(Clojure.read("com.example.examplemod.test"));

        // Test Clojure function
        IFn plus = Clojure.var("clojure.core", "+");
        IFn hello = Clojure.var("com.example.examplemod.test", "hello");
        System.out.println("Result from Clojure: " + hello.invoke("World!"));
    }
}
