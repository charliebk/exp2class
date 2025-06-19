package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcRailType extends IfcBuiltElementType {

    public IfcRailTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcRailTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcRailTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcRailTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcRailTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
