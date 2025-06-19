package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcPileType extends IfcDeepFoundationType {

    public IfcPileTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcPileTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcPileTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcPileTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcPileTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
