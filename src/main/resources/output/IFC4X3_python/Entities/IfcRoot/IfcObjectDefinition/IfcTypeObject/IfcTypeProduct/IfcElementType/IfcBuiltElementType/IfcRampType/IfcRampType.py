class IfcRampType(IfcBuiltElementType):
    def __init__(self):
        self.PredefinedType: IfcRampTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcRampTypeEnum.USERDEFINED) OR ((PredefinedType = IfcRampTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
