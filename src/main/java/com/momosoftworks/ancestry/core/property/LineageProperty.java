package com.momosoftworks.ancestry.core.property;

import com.momosoftworks.ancestry.core.lineage.Lineage;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class LineageProperty implements ILineageProperty
{
    private Lineage lineage;

    public LineageProperty(Lineage lineage)
    {
        this.lineage = lineage;
    }

    @Override
    public Lineage getLineage()
    {
        return null;
    }

    @Override
    public void setLineage(Lineage lineage)
    {

    }

    @Override
    public void saveNBTData(NBTTagCompound compound)
    {
        compound.setTag("Lineage", this.lineage.serialize());
    }

    @Override
    public void loadNBTData(NBTTagCompound compound)
    {
        this.lineage = 
    }

    @Override
    public void init(Entity entity, World world)
    {

    }
}
