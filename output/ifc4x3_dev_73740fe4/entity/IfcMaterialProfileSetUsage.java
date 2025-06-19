package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcMaterialProfileSetUsage extends IfcMaterialUsageDefinition {

    public IfcMaterialProfileSet ForProfileSet;
    public IfcCardinalPointReference CardinalPoint; // OPTIONAL
    public IfcPositiveLengthMeasure ReferenceExtent; // OPTIONAL

    // SUPERTYPE OF:
    // - IfcMaterialProfileSetUsageTapering SUBTYPE OF IfcMaterialUsageDefinition
}
