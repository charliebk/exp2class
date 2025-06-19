public class IfcReinforcingMesh : IfcReinforcingElement
{
    public IfcPositiveLengthMeasure MeshLength { get; set; }
    public IfcPositiveLengthMeasure MeshWidth { get; set; }
    public IfcPositiveLengthMeasure LongitudinalBarNominalDiameter { get; set; }
    public IfcPositiveLengthMeasure TransverseBarNominalDiameter { get; set; }
    public IfcAreaMeasure LongitudinalBarCrossSectionArea { get; set; }
    public IfcAreaMeasure TransverseBarCrossSectionArea { get; set; }
    public IfcPositiveLengthMeasure LongitudinalBarSpacing { get; set; }
    public IfcPositiveLengthMeasure TransverseBarSpacing { get; set; }
    public IfcReinforcingMeshTypeEnum PredefinedType { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcReinforcingMeshTypeEnum.USERDEFINED) OR ((PredefinedType = IfcReinforcingMeshTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCREINFORCINGMESHTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
