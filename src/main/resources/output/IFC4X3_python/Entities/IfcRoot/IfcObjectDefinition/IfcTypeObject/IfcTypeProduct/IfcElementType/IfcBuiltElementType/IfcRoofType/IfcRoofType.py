class IfcRoofType(IfcBuiltElementType):
    def __init__(self):
        self.PredefinedType: IfcRoofTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcRoofTypeEnum.USERDEFINED) OR ((PredefinedType = IfcRoofTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
