package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcStairType extends IfcBuiltElementType {

    public IfcStairTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcStairTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcStairTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcStairTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcStairTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
