package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcBridgePart extends IfcFacilityPart {

    public IfcBridgePartTypeEnum PredefinedType; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcBridgePartTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcBridgePartTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));

    // WHERE constraints:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcBridgePartTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcBridgePartTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
}
