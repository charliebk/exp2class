public class IfcReinforcingMesh extends IfcReinforcingElement {
    public IfcPositiveLengthMeasure MeshLength;
    public IfcPositiveLengthMeasure MeshWidth;
    public IfcPositiveLengthMeasure LongitudinalBarNominalDiameter;
    public IfcPositiveLengthMeasure TransverseBarNominalDiameter;
    public IfcAreaMeasure LongitudinalBarCrossSectionArea;
    public IfcAreaMeasure TransverseBarCrossSectionArea;
    public IfcPositiveLengthMeasure LongitudinalBarSpacing;
    public IfcPositiveLengthMeasure TransverseBarSpacing;
    public IfcReinforcingMeshTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcReinforcingMeshTypeEnum.USERDEFINED) OR ((PredefinedType = IfcReinforcingMeshTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCREINFORCINGMESHTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
