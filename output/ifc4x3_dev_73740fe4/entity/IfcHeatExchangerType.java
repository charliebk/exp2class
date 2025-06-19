package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcHeatExchangerType extends IfcEnergyConversionDeviceType {

    public IfcHeatExchangerTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcHeatExchangerTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcHeatExchangerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcHeatExchangerTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcHeatExchangerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
