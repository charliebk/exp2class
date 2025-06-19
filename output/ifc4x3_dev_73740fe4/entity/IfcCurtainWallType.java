package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcCurtainWallType extends IfcBuiltElementType {

    public IfcCurtainWallTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcCurtainWallTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcCurtainWallTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcCurtainWallTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcCurtainWallTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
