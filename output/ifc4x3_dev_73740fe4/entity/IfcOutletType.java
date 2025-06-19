package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcOutletType extends IfcFlowTerminalType {

    public IfcOutletTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcOutletTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcOutletTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcOutletTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcOutletTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
