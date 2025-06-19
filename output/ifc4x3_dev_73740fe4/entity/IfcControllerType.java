package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcControllerType extends IfcDistributionControlElementType {

    public IfcControllerTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcControllerTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcControllerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcControllerTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcControllerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
