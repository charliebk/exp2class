package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcProjectionElement extends IfcFeatureElementAddition {

    public IfcProjectionElementTypeEnum PredefinedType; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcProjectionElementTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcProjectionElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));

    // WHERE constraints:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcProjectionElementTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcProjectionElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
}
