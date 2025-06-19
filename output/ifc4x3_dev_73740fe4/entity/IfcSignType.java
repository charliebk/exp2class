package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcSignType extends IfcElementComponentType {

    public IfcSignTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcSignTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcSignTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcSignTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcSignTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
