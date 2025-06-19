class IfcReinforcingBar(IfcReinforcingElement):
    def __init__(self):
        self.NominalDiameter: IfcPositiveLengthMeasure = None
        self.CrossSectionArea: IfcAreaMeasure = None
        self.BarLength: IfcPositiveLengthMeasure = None
        self.PredefinedType: IfcReinforcingBarTypeEnum = None
        self.BarSurface: IfcReinforcingBarSurfaceEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcReinforcingBarTypeEnum.USERDEFINED) OR ((PredefinedType = IfcReinforcingBarTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    # CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCREINFORCINGBARTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
