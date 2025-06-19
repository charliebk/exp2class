class IfcLampType(IfcFlowTerminalType):
    def __init__(self):
        self.PredefinedType: IfcLampTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcLampTypeEnum.USERDEFINED) OR ((PredefinedType = IfcLampTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
