package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcBoilerType extends IfcEnergyConversionDeviceType {

    public IfcBoilerTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcBoilerTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcBoilerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcBoilerTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcBoilerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
