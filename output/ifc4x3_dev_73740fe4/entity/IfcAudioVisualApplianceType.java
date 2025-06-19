package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcAudioVisualApplianceType extends IfcFlowTerminalType {

    public IfcAudioVisualApplianceTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcAudioVisualApplianceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcAudioVisualApplianceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcAudioVisualApplianceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcAudioVisualApplianceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
