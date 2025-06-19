package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcMaterialConstituent extends IfcMaterialDefinition {

    public IfcLabel Name; // OPTIONAL
    public IfcText Description; // OPTIONAL
    public IfcMaterial Material;
    public IfcNormalisedRatioMeasure Fraction; // OPTIONAL
    public IfcLabel Category; // OPTIONAL
    // INVERSE attributes:
    // ToMaterialConstituentSet : IfcMaterialConstituentSet FOR MaterialConstituents;
}
