package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcProtectiveDeviceType extends IfcFlowControllerType {

    public IfcProtectiveDeviceTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcProtectiveDeviceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcProtectiveDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcProtectiveDeviceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcProtectiveDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
