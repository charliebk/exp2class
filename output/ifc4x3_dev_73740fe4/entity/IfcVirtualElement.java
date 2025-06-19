package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcVirtualElement extends IfcElement {

    public IfcVirtualElementTypeEnum PredefinedType; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcVirtualElementTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcVirtualElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));

    // WHERE constraints:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcVirtualElementTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcVirtualElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
}
