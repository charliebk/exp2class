package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcConstructionMaterialResourceType extends IfcConstructionResourceType {

    public IfcConstructionMaterialResourceTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcConstructionMaterialResourceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcConstructionMaterialResourceTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcTypeResource.ResourceType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcConstructionMaterialResourceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcConstructionMaterialResourceTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcTypeResource.ResourceType));
}
