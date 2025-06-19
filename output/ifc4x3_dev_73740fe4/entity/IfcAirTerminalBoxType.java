package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcAirTerminalBoxType extends IfcFlowControllerType {

    public IfcAirTerminalBoxTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcAirTerminalBoxTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcAirTerminalBoxTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcAirTerminalBoxTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcAirTerminalBoxTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
