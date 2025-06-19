public class IfcReinforcingBarType : IfcReinforcingElementType
{
    public IfcReinforcingBarTypeEnum PredefinedType { get; set; }
    public IfcPositiveLengthMeasure NominalDiameter { get; set; }
    public IfcAreaMeasure CrossSectionArea { get; set; }
    public IfcPositiveLengthMeasure BarLength { get; set; }
    public IfcReinforcingBarSurfaceEnum BarSurface { get; set; }
    public IfcLabel BendingShapeCode { get; set; }
    public List<IfcBendingParameterSelect> BendingParameters { get; set; }

    // === WHERE CLAUSES ===
    // BendingShapeCodeProvided : NOT EXISTS(BendingParameters) OR EXISTS(BendingShapeCode)
    // CorrectPredefinedType : (PredefinedType <> IfcReinforcingBarTypeEnum.USERDEFINED) OR ((PredefinedType = IfcReinforcingBarTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
