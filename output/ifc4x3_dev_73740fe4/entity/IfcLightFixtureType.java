package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcLightFixtureType extends IfcFlowTerminalType {

    public IfcLightFixtureTypeEnum PredefinedType;
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcLightFixtureTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcLightFixtureTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcLightFixtureTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcLightFixtureTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
