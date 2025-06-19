package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcCondenserType extends IfcEnergyConversionDeviceType {

    public IfcCondenserTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcCondenserTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcCondenserTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcCondenserTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcCondenserTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
