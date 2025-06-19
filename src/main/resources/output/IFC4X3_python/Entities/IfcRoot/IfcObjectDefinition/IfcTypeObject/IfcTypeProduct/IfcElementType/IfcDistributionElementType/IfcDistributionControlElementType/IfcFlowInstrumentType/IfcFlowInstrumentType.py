class IfcFlowInstrumentType(IfcDistributionControlElementType):
    def __init__(self):
        self.PredefinedType: IfcFlowInstrumentTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcFlowInstrumentTypeEnum.USERDEFINED) OR ((PredefinedType = IfcFlowInstrumentTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
