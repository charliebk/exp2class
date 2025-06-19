public class IfcReinforcingMeshType : IfcReinforcingElementType
{
    public IfcReinforcingMeshTypeEnum PredefinedType { get; set; }
    public IfcPositiveLengthMeasure MeshLength { get; set; }
    public IfcPositiveLengthMeasure MeshWidth { get; set; }
    public IfcPositiveLengthMeasure LongitudinalBarNominalDiameter { get; set; }
    public IfcPositiveLengthMeasure TransverseBarNominalDiameter { get; set; }
    public IfcAreaMeasure LongitudinalBarCrossSectionArea { get; set; }
    public IfcAreaMeasure TransverseBarCrossSectionArea { get; set; }
    public IfcPositiveLengthMeasure LongitudinalBarSpacing { get; set; }
    public IfcPositiveLengthMeasure TransverseBarSpacing { get; set; }
    public IfcLabel BendingShapeCode { get; set; }
    public List<IfcBendingParameterSelect> BendingParameters { get; set; }

    // === WHERE CLAUSES ===
    // BendingShapeCodeProvided : NOT EXISTS(BendingParameters) OR EXISTS(BendingShapeCode)
    // CorrectPredefinedType : (PredefinedType <> IfcReinforcingMeshTypeEnum.USERDEFINED) OR ((PredefinedType = IfcReinforcingMeshTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
