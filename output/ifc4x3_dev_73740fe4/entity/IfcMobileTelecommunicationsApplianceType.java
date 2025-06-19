package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcMobileTelecommunicationsApplianceType extends IfcFlowTerminalType {

    public IfcMobileTelecommunicationsApplianceTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcMobileTelecommunicationsApplianceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcMobileTelecommunicationsApplianceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcMobileTelecommunicationsApplianceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcMobileTelecommunicationsApplianceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
