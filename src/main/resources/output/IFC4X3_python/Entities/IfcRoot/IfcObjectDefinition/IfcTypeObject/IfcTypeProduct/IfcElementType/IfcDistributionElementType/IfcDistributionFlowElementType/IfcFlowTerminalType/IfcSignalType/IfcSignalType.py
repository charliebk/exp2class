class IfcSignalType(IfcFlowTerminalType):
    def __init__(self):
        self.PredefinedType: IfcSignalTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcSignalTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSignalTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
