package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcRoofType extends IfcBuiltElementType {

    public IfcRoofTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcRoofTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcRoofTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcRoofTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcRoofTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
