package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcRailwayPart extends IfcFacilityPart {

    public IfcRailwayPartTypeEnum PredefinedType; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcRailwayPartTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcRailwayPartTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));

    // WHERE constraints:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcRailwayPartTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcRailwayPartTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
}
