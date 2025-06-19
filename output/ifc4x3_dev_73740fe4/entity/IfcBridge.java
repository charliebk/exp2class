package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcBridge extends IfcFacility {

    public IfcBridgeTypeEnum PredefinedType; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcBridgeTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcBridgeTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));

    // WHERE constraints:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcBridgeTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcBridgeTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
}
