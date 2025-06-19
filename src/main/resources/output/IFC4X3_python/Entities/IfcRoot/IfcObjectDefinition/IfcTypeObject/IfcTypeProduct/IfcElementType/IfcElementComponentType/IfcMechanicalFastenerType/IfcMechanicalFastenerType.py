class IfcMechanicalFastenerType(IfcElementComponentType):
    def __init__(self):
        self.PredefinedType: IfcMechanicalFastenerTypeEnum = None
        self.NominalDiameter: IfcPositiveLengthMeasure = None
        self.NominalLength: IfcPositiveLengthMeasure = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcMechanicalFastenerTypeEnum.USERDEFINED) OR ((PredefinedType = IfcMechanicalFastenerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
