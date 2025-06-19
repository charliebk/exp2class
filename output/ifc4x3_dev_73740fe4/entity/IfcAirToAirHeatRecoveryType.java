package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcAirToAirHeatRecoveryType extends IfcEnergyConversionDeviceType {

    public IfcAirToAirHeatRecoveryTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcAirToAirHeatRecoveryTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcAirToAirHeatRecoveryTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcAirToAirHeatRecoveryTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcAirToAirHeatRecoveryTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
