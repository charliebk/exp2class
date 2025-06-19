package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcSwitchingDeviceType extends IfcFlowControllerType {

    public IfcSwitchingDeviceTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcSwitchingDeviceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcSwitchingDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcSwitchingDeviceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcSwitchingDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
