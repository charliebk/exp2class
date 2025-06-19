class IfcBeamType(IfcBuiltElementType):
    def __init__(self):
        self.PredefinedType: IfcBeamTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcBeamTypeEnum.USERDEFINED) OR ((PredefinedType = IfcBeamTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
