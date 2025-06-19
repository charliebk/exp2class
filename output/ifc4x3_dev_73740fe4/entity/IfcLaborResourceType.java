package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcLaborResourceType extends IfcConstructionResourceType {

    public IfcLaborResourceTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcLaborResourceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcLaborResourceTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcTypeResource.ResourceType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcLaborResourceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcLaborResourceTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcTypeResource.ResourceType));
}
