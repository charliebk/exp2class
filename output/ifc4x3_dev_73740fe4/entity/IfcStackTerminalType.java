package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcStackTerminalType extends IfcFlowTerminalType {

    public IfcStackTerminalTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcStackTerminalTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcStackTerminalTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcStackTerminalTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcStackTerminalTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
