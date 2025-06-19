package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcHumidifierType extends IfcEnergyConversionDeviceType {

    public IfcHumidifierTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcHumidifierTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcHumidifierTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcHumidifierTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcHumidifierTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
