package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public class IfcProfileDef {

    public IfcProfileTypeEnum ProfileType;
    public IfcLabel ProfileName; // OPTIONAL
    // INVERSE attributes:
    // HasExternalReference : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects;
    // HasProperties : SET [0:?] OF IfcProfileProperties FOR ProfileDefinition;

    // SUPERTYPE OF:
    // - IfcArbitraryClosedProfileDef
    // - IfcArbitraryOpenProfileDef
    // - IfcCompositeProfileDef
    // - IfcDerivedProfileDef
    // - IfcOpenCrossProfileDef
    // - IfcParameterizedProfileDef
}
