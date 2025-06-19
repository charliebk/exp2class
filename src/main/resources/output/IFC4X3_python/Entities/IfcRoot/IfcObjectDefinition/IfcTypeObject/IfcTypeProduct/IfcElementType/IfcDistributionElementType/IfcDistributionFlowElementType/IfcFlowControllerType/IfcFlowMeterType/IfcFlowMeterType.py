class IfcFlowMeterType(IfcFlowControllerType):
    def __init__(self):
        self.PredefinedType: IfcFlowMeterTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcFlowMeterTypeEnum.USERDEFINED) OR ((PredefinedType = IfcFlowMeterTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
