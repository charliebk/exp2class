package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcAirTerminalType extends IfcFlowTerminalType {

    public IfcAirTerminalTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcAirTerminalTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcAirTerminalTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcAirTerminalTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcAirTerminalTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
