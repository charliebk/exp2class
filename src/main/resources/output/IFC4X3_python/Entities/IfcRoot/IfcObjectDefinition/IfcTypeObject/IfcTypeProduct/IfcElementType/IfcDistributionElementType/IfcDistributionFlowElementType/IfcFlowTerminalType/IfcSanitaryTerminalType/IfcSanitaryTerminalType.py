class IfcSanitaryTerminalType(IfcFlowTerminalType):
    def __init__(self):
        self.PredefinedType: IfcSanitaryTerminalTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcSanitaryTerminalTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSanitaryTerminalTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
