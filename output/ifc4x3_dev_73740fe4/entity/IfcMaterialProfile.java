package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcMaterialProfile extends IfcMaterialDefinition {

    public IfcLabel Name; // OPTIONAL
    public IfcText Description; // OPTIONAL
    public IfcMaterial Material; // OPTIONAL
    public IfcProfileDef Profile;
    public IfcInteger Priority; // OPTIONAL
    public IfcLabel Category; // OPTIONAL
    // INVERSE attributes:
    // ToMaterialProfileSet : IfcMaterialProfileSet FOR MaterialProfiles;
    // INVERSE attributes:
    // NormalizedPriority : NOT(EXISTS(Priority)) OR {0 <= Priority <= 100};

    // SUPERTYPE OF:
    // - IfcMaterialProfileWithOffsets SUBTYPE OF IfcMaterialDefinition

    // WHERE constraints:
    // NormalizedPriority : NOT(EXISTS(Priority)) OR {0 <= Priority <= 100};
}
