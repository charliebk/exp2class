package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcCrewResourceType extends IfcConstructionResourceType {

    public IfcCrewResourceTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcCrewResourceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcCrewResourceTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcTypeResource.ResourceType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcCrewResourceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcCrewResourceTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcTypeResource.ResourceType));
}
