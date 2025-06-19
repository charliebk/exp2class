package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcBeamType extends IfcBuiltElementType {

    public IfcBeamTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcBeamTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcBeamTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcBeamTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcBeamTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
