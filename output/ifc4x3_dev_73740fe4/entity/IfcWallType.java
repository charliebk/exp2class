package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcWallType extends IfcBuiltElementType {

    public IfcWallTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcWallTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcWallTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcWallTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcWallTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
