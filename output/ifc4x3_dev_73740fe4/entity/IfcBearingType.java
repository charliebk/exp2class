package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcBearingType extends IfcBuiltElementType {

    public IfcBearingTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcBearingTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcBearingTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcBearingTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcBearingTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
