package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcProtectiveDeviceTrippingUnitType extends IfcDistributionControlElementType {

    public IfcProtectiveDeviceTrippingUnitTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcProtectiveDeviceTrippingUnitTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcProtectiveDeviceTrippingUnitTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcProtectiveDeviceTrippingUnitTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcProtectiveDeviceTrippingUnitTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
