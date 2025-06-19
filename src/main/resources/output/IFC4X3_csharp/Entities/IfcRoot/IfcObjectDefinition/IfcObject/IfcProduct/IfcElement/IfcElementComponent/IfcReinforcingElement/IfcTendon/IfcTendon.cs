public class IfcTendon : IfcReinforcingElement
{
    public IfcTendonTypeEnum PredefinedType { get; set; }
    public IfcPositiveLengthMeasure NominalDiameter { get; set; }
    public IfcAreaMeasure CrossSectionArea { get; set; }
    public IfcForceMeasure TensionForce { get; set; }
    public IfcPressureMeasure PreStress { get; set; }
    public IfcNormalisedRatioMeasure FrictionCoefficient { get; set; }
    public IfcPositiveLengthMeasure AnchorageSlip { get; set; }
    public IfcPositiveLengthMeasure MinCurvatureRadius { get; set; }

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcTendonTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTendonTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCTENDONTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
