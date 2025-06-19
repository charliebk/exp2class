package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcFootingType extends IfcBuiltElementType {

    public IfcFootingTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcFootingTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcFootingTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcFootingTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcFootingTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
