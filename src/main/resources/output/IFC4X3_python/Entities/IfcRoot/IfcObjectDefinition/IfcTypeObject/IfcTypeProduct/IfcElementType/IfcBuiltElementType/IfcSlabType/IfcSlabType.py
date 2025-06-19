class IfcSlabType(IfcBuiltElementType):
    def __init__(self):
        self.PredefinedType: IfcSlabTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcSlabTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSlabTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
