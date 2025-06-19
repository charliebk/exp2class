package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcMemberType extends IfcBuiltElementType {

    public IfcMemberTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcMemberTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcMemberTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcMemberTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcMemberTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
