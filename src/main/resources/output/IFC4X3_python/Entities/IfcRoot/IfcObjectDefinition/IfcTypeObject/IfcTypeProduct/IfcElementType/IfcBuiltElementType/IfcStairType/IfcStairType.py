class IfcStairType(IfcBuiltElementType):
    def __init__(self):
        self.PredefinedType: IfcStairTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcStairTypeEnum.USERDEFINED) OR ((PredefinedType = IfcStairTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
