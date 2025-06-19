package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcStairFlightType extends IfcBuiltElementType {

    public IfcStairFlightTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcStairFlightTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcStairFlightTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcStairFlightTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcStairFlightTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
