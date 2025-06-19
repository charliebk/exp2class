package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcColumnType extends IfcBuiltElementType {

    public IfcColumnTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcColumnTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcColumnTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcColumnTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcColumnTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
