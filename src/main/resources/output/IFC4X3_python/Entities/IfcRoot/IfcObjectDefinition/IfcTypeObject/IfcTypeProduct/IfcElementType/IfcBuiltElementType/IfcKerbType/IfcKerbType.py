class IfcKerbType(IfcBuiltElementType):
    def __init__(self):
        self.PredefinedType: IfcKerbTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcKerbTypeEnum.USERDEFINED) OR ((PredefinedType = IfcKerbTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
