class IfcChimneyType(IfcBuiltElementType):
    def __init__(self):
        self.PredefinedType: IfcChimneyTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcChimneyTypeEnum.USERDEFINED) OR ((PredefinedType = IfcChimneyTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
