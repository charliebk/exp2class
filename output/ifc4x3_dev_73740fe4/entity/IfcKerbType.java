package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcKerbType extends IfcBuiltElementType {

    public IfcKerbTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcKerbTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcKerbTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcKerbTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcKerbTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
