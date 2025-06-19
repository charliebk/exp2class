package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcMarineFacility extends IfcFacility {

    public IfcMarineFacilityTypeEnum PredefinedType; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcMarineFacilityTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcMarineFacilityTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));

    // WHERE constraints:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcMarineFacilityTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcMarineFacilityTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
}
