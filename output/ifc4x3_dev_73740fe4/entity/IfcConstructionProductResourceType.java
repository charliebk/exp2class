package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcConstructionProductResourceType extends IfcConstructionResourceType {

    public IfcConstructionProductResourceTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcConstructionProductResourceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcConstructionProductResourceTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcTypeResource.ResourceType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcConstructionProductResourceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcConstructionProductResourceTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcTypeResource.ResourceType));
}
