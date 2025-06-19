package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcDiscreteAccessoryType extends IfcElementComponentType {

    public IfcDiscreteAccessoryTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcDiscreteAccessoryTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcDiscreteAccessoryTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcDiscreteAccessoryTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcDiscreteAccessoryTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
