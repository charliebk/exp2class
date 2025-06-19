package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcEvaporativeCoolerType extends IfcEnergyConversionDeviceType {

    public IfcEvaporativeCoolerTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcEvaporativeCoolerTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcEvaporativeCoolerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcEvaporativeCoolerTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcEvaporativeCoolerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
