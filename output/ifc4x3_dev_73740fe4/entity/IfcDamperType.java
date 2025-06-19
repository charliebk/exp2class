package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcDamperType extends IfcFlowControllerType {

    public IfcDamperTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcDamperTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcDamperTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcDamperTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcDamperTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
