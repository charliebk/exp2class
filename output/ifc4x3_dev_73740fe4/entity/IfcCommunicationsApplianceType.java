package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcCommunicationsApplianceType extends IfcFlowTerminalType {

    public IfcCommunicationsApplianceTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcCommunicationsApplianceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcCommunicationsApplianceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcCommunicationsApplianceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcCommunicationsApplianceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
