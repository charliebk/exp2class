class IfcCurtainWallType(IfcBuiltElementType):
    def __init__(self):
        self.PredefinedType: IfcCurtainWallTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcCurtainWallTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCurtainWallTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
