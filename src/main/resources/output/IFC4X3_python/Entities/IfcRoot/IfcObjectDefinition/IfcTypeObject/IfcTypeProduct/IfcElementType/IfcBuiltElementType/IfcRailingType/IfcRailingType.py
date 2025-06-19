class IfcRailingType(IfcBuiltElementType):
    def __init__(self):
        self.PredefinedType: IfcRailingTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcRailingTypeEnum.USERDEFINED) OR ((PredefinedType = IfcRailingTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
