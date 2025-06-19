class IfcWallType(IfcBuiltElementType):
    def __init__(self):
        self.PredefinedType: IfcWallTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcWallTypeEnum.USERDEFINED) OR ((PredefinedType = IfcWallTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
