package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcUnitaryEquipmentType extends IfcEnergyConversionDeviceType {

    public IfcUnitaryEquipmentTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcUnitaryEquipmentTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcUnitaryEquipmentTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcUnitaryEquipmentTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcUnitaryEquipmentTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
