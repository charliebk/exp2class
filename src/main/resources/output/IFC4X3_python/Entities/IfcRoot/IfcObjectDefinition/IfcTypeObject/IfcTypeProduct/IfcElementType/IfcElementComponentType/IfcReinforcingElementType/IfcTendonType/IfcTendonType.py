class IfcTendonType(IfcReinforcingElementType):
    def __init__(self):
        self.PredefinedType: IfcTendonTypeEnum = None
        self.NominalDiameter: IfcPositiveLengthMeasure = None
        self.CrossSectionArea: IfcAreaMeasure = None
        self.SheathDiameter: IfcPositiveLengthMeasure = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcTendonTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTendonTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
