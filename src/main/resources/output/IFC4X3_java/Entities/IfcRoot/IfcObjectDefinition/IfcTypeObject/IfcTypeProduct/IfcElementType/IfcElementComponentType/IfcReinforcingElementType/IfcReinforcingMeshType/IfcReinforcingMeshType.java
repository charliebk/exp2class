public class IfcReinforcingMeshType extends IfcReinforcingElementType {
    public IfcReinforcingMeshTypeEnum PredefinedType;
    public IfcPositiveLengthMeasure MeshLength;
    public IfcPositiveLengthMeasure MeshWidth;
    public IfcPositiveLengthMeasure LongitudinalBarNominalDiameter;
    public IfcPositiveLengthMeasure TransverseBarNominalDiameter;
    public IfcAreaMeasure LongitudinalBarCrossSectionArea;
    public IfcAreaMeasure TransverseBarCrossSectionArea;
    public IfcPositiveLengthMeasure LongitudinalBarSpacing;
    public IfcPositiveLengthMeasure TransverseBarSpacing;
    public IfcLabel BendingShapeCode;
    public List<IfcBendingParameterSelect> BendingParameters;

    // === WHERE CLAUSES ===
    // BendingShapeCodeProvided : NOT EXISTS(BendingParameters) OR EXISTS(BendingShapeCode)
    // CorrectPredefinedType : (PredefinedType <> IfcReinforcingMeshTypeEnum.USERDEFINED) OR ((PredefinedType = IfcReinforcingMeshTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
}
