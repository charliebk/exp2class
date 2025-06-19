class IfcReinforcingMesh(IfcReinforcingElement):
    def __init__(self):
        self.MeshLength: IfcPositiveLengthMeasure = None
        self.MeshWidth: IfcPositiveLengthMeasure = None
        self.LongitudinalBarNominalDiameter: IfcPositiveLengthMeasure = None
        self.TransverseBarNominalDiameter: IfcPositiveLengthMeasure = None
        self.LongitudinalBarCrossSectionArea: IfcAreaMeasure = None
        self.TransverseBarCrossSectionArea: IfcAreaMeasure = None
        self.LongitudinalBarSpacing: IfcPositiveLengthMeasure = None
        self.TransverseBarSpacing: IfcPositiveLengthMeasure = None
        self.PredefinedType: IfcReinforcingMeshTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcReinforcingMeshTypeEnum.USERDEFINED) OR ((PredefinedType = IfcReinforcingMeshTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    # CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCREINFORCINGMESHTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
