class IfcCableSegmentType(IfcFlowSegmentType):
    def __init__(self):
        self.PredefinedType: IfcCableSegmentTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcCableSegmentTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCableSegmentTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
