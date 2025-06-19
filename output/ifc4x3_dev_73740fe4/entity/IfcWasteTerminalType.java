package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcWasteTerminalType extends IfcFlowTerminalType {

    public IfcWasteTerminalTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcWasteTerminalTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcWasteTerminalTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcWasteTerminalTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcWasteTerminalTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
