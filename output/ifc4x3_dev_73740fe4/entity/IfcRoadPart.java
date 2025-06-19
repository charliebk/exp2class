package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcRoadPart extends IfcFacilityPart {

    public IfcRoadPartTypeEnum PredefinedType; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcRoadPartTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcRoadPartTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));

    // WHERE constraints:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcRoadPartTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcRoadPartTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
}
