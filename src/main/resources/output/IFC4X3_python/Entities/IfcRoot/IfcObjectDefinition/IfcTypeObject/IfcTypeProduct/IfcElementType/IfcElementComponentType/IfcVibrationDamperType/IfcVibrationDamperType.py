class IfcVibrationDamperType(IfcElementComponentType):
    def __init__(self):
        self.PredefinedType: IfcVibrationDamperTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcVibrationDamperTypeEnum.USERDEFINED) OR ((PredefinedType = IfcVibrationDamperTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
