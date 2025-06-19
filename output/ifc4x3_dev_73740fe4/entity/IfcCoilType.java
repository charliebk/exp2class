package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcCoilType extends IfcEnergyConversionDeviceType {

    public IfcCoilTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcCoilTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcCoilTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcCoilTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcCoilTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
