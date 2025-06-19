package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcFireSuppressionTerminalType extends IfcFlowTerminalType {

    public IfcFireSuppressionTerminalTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcFireSuppressionTerminalTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcFireSuppressionTerminalTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcFireSuppressionTerminalTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcFireSuppressionTerminalTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
