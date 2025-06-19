package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcMedicalDeviceType extends IfcFlowTerminalType {

    public IfcMedicalDeviceTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcMedicalDeviceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcMedicalDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcMedicalDeviceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcMedicalDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
