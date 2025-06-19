package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcCoveringType extends IfcBuiltElementType {

    public IfcCoveringTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcCoveringTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcCoveringTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcCoveringTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcCoveringTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
