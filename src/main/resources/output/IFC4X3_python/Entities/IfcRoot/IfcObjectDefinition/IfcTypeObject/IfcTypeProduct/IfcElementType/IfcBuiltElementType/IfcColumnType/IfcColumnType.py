class IfcColumnType(IfcBuiltElementType):
    def __init__(self):
        self.PredefinedType: IfcColumnTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcColumnTypeEnum.USERDEFINED) OR ((PredefinedType = IfcColumnTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
