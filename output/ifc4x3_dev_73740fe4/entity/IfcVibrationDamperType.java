package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcVibrationDamperType extends IfcElementComponentType {

    public IfcVibrationDamperTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcVibrationDamperTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcVibrationDamperTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcVibrationDamperTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcVibrationDamperTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
