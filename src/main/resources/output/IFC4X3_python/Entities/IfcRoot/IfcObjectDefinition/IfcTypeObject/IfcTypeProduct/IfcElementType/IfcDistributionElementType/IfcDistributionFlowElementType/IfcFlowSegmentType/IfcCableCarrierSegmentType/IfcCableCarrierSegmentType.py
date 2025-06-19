class IfcCableCarrierSegmentType(IfcFlowSegmentType):
    def __init__(self):
        self.PredefinedType: IfcCableCarrierSegmentTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcCableCarrierSegmentTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCableCarrierSegmentTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
