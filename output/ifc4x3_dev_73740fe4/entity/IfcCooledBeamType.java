package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcCooledBeamType extends IfcEnergyConversionDeviceType {

    public IfcCooledBeamTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcCooledBeamTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcCooledBeamTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcCooledBeamTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcCooledBeamTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
