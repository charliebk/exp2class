class IfcBearingType(IfcBuiltElementType):
    def __init__(self):
        self.PredefinedType: IfcBearingTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcBearingTypeEnum.USERDEFINED) OR ((PredefinedType = IfcBearingTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
