public class IfcTendon extends IfcReinforcingElement {
    public IfcTendonTypeEnum PredefinedType;
    public IfcPositiveLengthMeasure NominalDiameter;
    public IfcAreaMeasure CrossSectionArea;
    public IfcForceMeasure TensionForce;
    public IfcPressureMeasure PreStress;
    public IfcNormalisedRatioMeasure FrictionCoefficient;
    public IfcPositiveLengthMeasure AnchorageSlip;
    public IfcPositiveLengthMeasure MinCurvatureRadius;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcTendonTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTendonTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCTENDONTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
