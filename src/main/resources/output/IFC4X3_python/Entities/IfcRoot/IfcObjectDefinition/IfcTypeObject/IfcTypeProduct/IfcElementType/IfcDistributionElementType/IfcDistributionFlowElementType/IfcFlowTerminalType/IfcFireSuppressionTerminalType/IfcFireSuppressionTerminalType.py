class IfcFireSuppressionTerminalType(IfcFlowTerminalType):
    def __init__(self):
        self.PredefinedType: IfcFireSuppressionTerminalTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcFireSuppressionTerminalTypeEnum.USERDEFINED) OR ((PredefinedType = IfcFireSuppressionTerminalTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
