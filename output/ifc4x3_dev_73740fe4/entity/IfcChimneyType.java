package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcChimneyType extends IfcBuiltElementType {

    public IfcChimneyTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcChimneyTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcChimneyTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcChimneyTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcChimneyTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
