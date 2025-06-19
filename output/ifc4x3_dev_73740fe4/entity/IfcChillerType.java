package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcChillerType extends IfcEnergyConversionDeviceType {

    public IfcChillerTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcChillerTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcChillerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcChillerTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcChillerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
