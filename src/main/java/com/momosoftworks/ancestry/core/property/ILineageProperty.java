package com.momosoftworks.ancestry.core.property;

import com.momosoftworks.ancestry.core.lineage.Lineage;
import net.minecraftforge.common.IExtendedEntityProperties;

public interface ILineageProperty extends IExtendedEntityProperties
{
    Lineage getLineage();
    void setLineage(Lineage lineage);
}
