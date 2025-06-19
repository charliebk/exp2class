package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcConstructionEquipmentResourceType extends IfcConstructionResourceType {

    public IfcConstructionEquipmentResourceTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcConstructionEquipmentResourceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcConstructionEquipmentResourceTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcTypeResource.ResourceType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcConstructionEquipmentResourceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcConstructionEquipmentResourceTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcTypeResource.ResourceType));
}
