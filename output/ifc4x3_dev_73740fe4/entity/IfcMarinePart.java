package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcMarinePart extends IfcFacilityPart {

    public IfcMarinePartTypeEnum PredefinedType; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcMarinePartTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcMarinePartTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));

    // WHERE constraints:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcMarinePartTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcMarinePartTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
}
