package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcCourseType extends IfcBuiltElementType {

    public IfcCourseTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcCourseTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcCourseTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcCourseTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcCourseTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
