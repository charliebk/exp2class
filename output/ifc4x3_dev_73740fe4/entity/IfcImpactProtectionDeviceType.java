package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcImpactProtectionDeviceType extends IfcElementComponentType {

    public IfcImpactProtectionDeviceTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcImpactProtectionDeviceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcImpactProtectionDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcImpactProtectionDeviceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcImpactProtectionDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
