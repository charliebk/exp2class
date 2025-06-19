package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcShadingDeviceType extends IfcBuiltElementType {

    public IfcShadingDeviceTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcShadingDeviceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcShadingDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcShadingDeviceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcShadingDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
