package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcRampType extends IfcBuiltElementType {

    public IfcRampTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcRampTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcRampTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcRampTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcRampTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
