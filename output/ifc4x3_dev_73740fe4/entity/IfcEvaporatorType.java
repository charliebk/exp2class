package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcEvaporatorType extends IfcEnergyConversionDeviceType {

    public IfcEvaporatorTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcEvaporatorTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcEvaporatorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcEvaporatorTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcEvaporatorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
