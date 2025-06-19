class IfcWasteTerminalType(IfcFlowTerminalType):
    def __init__(self):
        self.PredefinedType: IfcWasteTerminalTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcWasteTerminalTypeEnum.USERDEFINED) OR ((PredefinedType = IfcWasteTerminalTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
