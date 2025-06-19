package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcVibrationIsolatorType extends IfcElementComponentType {

    public IfcVibrationIsolatorTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcVibrationIsolatorTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcVibrationIsolatorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcVibrationIsolatorTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcVibrationIsolatorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
