public class IfcReinforcingBarType extends IfcReinforcingElementType {
    public IfcReinforcingBarTypeEnum PredefinedType;
    public IfcPositiveLengthMeasure NominalDiameter;
    public IfcAreaMeasure CrossSectionArea;
    public IfcPositiveLengthMeasure BarLength;
    public IfcReinforcingBarSurfaceEnum BarSurface;
    public IfcLabel BendingShapeCode;
    public List<IfcBendingParameterSelect> BendingParameters;

    // === WHERE CLAUSES ===
    // BendingShapeCodeProvided : NOT EXISTS(BendingParameters) OR EXISTS(BendingShapeCode)
    // CorrectPredefinedType : (PredefinedType <> IfcReinforcingBarTypeEnum.USERDEFINED) OR ((PredefinedType = IfcReinforcingBarTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
