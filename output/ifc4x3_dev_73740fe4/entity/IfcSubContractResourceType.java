package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcSubContractResourceType extends IfcConstructionResourceType {

    public IfcSubContractResourceTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcSubContractResourceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcSubContractResourceTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcTypeResource.ResourceType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcSubContractResourceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcSubContractResourceTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcTypeResource.ResourceType));
}
