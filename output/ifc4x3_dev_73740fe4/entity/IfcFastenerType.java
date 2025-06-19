package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcFastenerType extends IfcElementComponentType {

    public IfcFastenerTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcFastenerTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcFastenerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcFastenerTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcFastenerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
