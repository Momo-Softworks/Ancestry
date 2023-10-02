package com.momosoftworks.ancestry.core.lineage;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;

import java.util.HashMap;
import java.util.Map;

public abstract class Lineage
{
    private final EntityPlayer player;
    private Map<String, Feature> features = new HashMap<>();
    
    public Lineage()
    {

    }

    public abstract NBTTagCompound serialize();
    public abstract void deserialize(NBTTagCompound nbt);

    public Feature getFeature(String name)
    {
        return features.get(name);
    }
}
