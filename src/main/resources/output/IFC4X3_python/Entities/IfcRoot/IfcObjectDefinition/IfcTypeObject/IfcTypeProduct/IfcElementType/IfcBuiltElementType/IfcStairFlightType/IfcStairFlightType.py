class IfcStairFlightType(IfcBuiltElementType):
    def __init__(self):
        self.PredefinedType: IfcStairFlightTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcStairFlightTypeEnum.USERDEFINED) OR ((PredefinedType = IfcStairFlightTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
