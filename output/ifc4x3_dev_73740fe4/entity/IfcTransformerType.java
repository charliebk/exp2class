package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcTransformerType extends IfcEnergyConversionDeviceType {

    public IfcTransformerTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcTransformerTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcTransformerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcTransformerTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcTransformerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
