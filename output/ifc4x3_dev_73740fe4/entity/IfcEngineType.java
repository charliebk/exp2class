package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcEngineType extends IfcEnergyConversionDeviceType {

    public IfcEngineTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcEngineTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcEngineTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcEngineTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcEngineTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
