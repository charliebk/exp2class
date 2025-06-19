package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcCoolingTowerType extends IfcEnergyConversionDeviceType {

    public IfcCoolingTowerTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcCoolingTowerTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcCoolingTowerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcCoolingTowerTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcCoolingTowerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
