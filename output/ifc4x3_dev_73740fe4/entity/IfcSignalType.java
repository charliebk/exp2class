package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcSignalType extends IfcFlowTerminalType {

    public IfcSignalTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcSignalTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcSignalTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcSignalTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcSignalTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
