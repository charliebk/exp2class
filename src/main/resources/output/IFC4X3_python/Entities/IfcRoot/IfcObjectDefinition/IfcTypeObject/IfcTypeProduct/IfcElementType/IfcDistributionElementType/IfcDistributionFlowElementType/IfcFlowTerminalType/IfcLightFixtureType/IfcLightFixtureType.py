class IfcLightFixtureType(IfcFlowTerminalType):
    def __init__(self):
        self.PredefinedType: IfcLightFixtureTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcLightFixtureTypeEnum.USERDEFINED) OR ((PredefinedType = IfcLightFixtureTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
