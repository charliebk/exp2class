package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcSolarDeviceType extends IfcEnergyConversionDeviceType {

    public IfcSolarDeviceTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcSolarDeviceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcSolarDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcSolarDeviceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcSolarDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
