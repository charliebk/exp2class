package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.Set;

public class IfcOpeningElement extends IfcFeatureElementSubtraction {

    public IfcOpeningElementTypeEnum PredefinedType; // OPTIONAL
    // INVERSE attributes:
    // HasFillings : SET [0:?] OF IfcRelFillsElement FOR RelatingOpeningElement;
    // INVERSE attributes:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcOpeningElementTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcOpeningElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));

    // WHERE constraints:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcOpeningElementTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcOpeningElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
}
