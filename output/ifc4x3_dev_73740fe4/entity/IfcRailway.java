package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcRailway extends IfcFacility {

    public IfcRailwayTypeEnum PredefinedType; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcRailwayTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcRailwayTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));

    // WHERE constraints:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcRailwayTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcRailwayTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
}
