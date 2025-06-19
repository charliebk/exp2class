class IfcVibrationIsolatorType(IfcElementComponentType):
    def __init__(self):
        self.PredefinedType: IfcVibrationIsolatorTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcVibrationIsolatorTypeEnum.USERDEFINED) OR ((PredefinedType = IfcVibrationIsolatorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
