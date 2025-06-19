package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcMotorConnectionType extends IfcEnergyConversionDeviceType {

    public IfcMotorConnectionTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcMotorConnectionTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcMotorConnectionTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcMotorConnectionTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcMotorConnectionTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
