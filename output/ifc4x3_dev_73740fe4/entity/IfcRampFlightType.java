package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcRampFlightType extends IfcBuiltElementType {

    public IfcRampFlightTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcRampFlightTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcRampFlightTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcRampFlightTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcRampFlightTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
