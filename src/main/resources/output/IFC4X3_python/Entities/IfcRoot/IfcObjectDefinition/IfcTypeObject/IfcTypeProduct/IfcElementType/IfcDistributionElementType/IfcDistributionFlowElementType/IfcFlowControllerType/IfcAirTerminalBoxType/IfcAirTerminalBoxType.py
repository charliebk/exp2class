class IfcAirTerminalBoxType(IfcFlowControllerType):
    def __init__(self):
        self.PredefinedType: IfcAirTerminalBoxTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcAirTerminalBoxTypeEnum.USERDEFINED) OR ((PredefinedType = IfcAirTerminalBoxTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
