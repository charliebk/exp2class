class IfcPlateType(IfcBuiltElementType):
    def __init__(self):
        self.PredefinedType: IfcPlateTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcPlateTypeEnum.USERDEFINED) OR ((PredefinedType = IfcPlateTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
