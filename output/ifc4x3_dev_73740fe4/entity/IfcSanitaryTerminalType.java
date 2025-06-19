package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcSanitaryTerminalType extends IfcFlowTerminalType {

    public IfcSanitaryTerminalTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcSanitaryTerminalTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcSanitaryTerminalTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcSanitaryTerminalTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcSanitaryTerminalTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
