package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcBurnerType extends IfcEnergyConversionDeviceType {

    public IfcBurnerTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcBurnerTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcBurnerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcBurnerTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcBurnerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
