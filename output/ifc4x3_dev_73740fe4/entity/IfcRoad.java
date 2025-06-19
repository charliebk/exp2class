package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcRoad extends IfcFacility {

    public IfcRoadTypeEnum PredefinedType; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcRoadTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcRoadTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));

    // WHERE constraints:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcRoadTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcRoadTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
}
