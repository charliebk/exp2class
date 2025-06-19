package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcElectricGeneratorType extends IfcEnergyConversionDeviceType {

    public IfcElectricGeneratorTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcElectricGeneratorTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcElectricGeneratorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcElectricGeneratorTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcElectricGeneratorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
