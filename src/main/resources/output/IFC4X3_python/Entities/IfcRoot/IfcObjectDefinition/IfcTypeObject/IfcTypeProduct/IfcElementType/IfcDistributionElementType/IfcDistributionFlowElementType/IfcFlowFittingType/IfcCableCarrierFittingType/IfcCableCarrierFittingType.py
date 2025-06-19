class IfcCableCarrierFittingType(IfcFlowFittingType):
    def __init__(self):
        self.PredefinedType: IfcCableCarrierFittingTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcCableCarrierFittingTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCableCarrierFittingTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
