class IfcTendon(IfcReinforcingElement):
    def __init__(self):
        self.PredefinedType: IfcTendonTypeEnum = None
        self.NominalDiameter: IfcPositiveLengthMeasure = None
        self.CrossSectionArea: IfcAreaMeasure = None
        self.TensionForce: IfcForceMeasure = None
        self.PreStress: IfcPressureMeasure = None
        self.FrictionCoefficient: IfcNormalisedRatioMeasure = None
        self.AnchorageSlip: IfcPositiveLengthMeasure = None
        self.MinCurvatureRadius: IfcPositiveLengthMeasure = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcTendonTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTendonTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    # CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCTENDONTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
