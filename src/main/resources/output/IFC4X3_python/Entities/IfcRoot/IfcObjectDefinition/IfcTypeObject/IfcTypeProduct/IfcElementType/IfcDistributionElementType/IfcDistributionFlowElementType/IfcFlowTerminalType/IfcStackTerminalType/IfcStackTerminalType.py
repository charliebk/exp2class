class IfcStackTerminalType(IfcFlowTerminalType):
    def __init__(self):
        self.PredefinedType: IfcStackTerminalTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcStackTerminalTypeEnum.USERDEFINED) OR ((PredefinedType = IfcStackTerminalTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
