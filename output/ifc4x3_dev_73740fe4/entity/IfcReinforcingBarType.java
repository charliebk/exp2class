package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


import java.util.List;

public class IfcReinforcingBarType extends IfcReinforcingElementType {

    public IfcReinforcingBarTypeEnum PredefinedType;
    public IfcPositiveLengthMeasure NominalDiameter; // OPTIONAL
    public IfcAreaMeasure CrossSectionArea; // OPTIONAL
    public IfcPositiveLengthMeasure BarLength; // OPTIONAL
    public IfcReinforcingBarSurfaceEnum BarSurface; // OPTIONAL
    public IfcLabel BendingShapeCode; // OPTIONAL
    // INVERSE attributes:
    // BendingShapeCodeProvided : NOT EXISTS(BendingParameters) OR EXISTS(BendingShapeCode);
    // CorrectPredefinedType : (PredefinedType <> IfcReinforcingBarTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcReinforcingBarTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // BendingShapeCodeProvided : NOT EXISTS(BendingParameters) OR EXISTS(BendingShapeCode);
    // CorrectPredefinedType : (PredefinedType <> IfcReinforcingBarTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcReinforcingBarTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
