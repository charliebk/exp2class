class IfcPipeSegmentType(IfcFlowSegmentType):
    def __init__(self):
        self.PredefinedType: IfcPipeSegmentTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcPipeSegmentTypeEnum.USERDEFINED) OR ((PredefinedType = IfcPipeSegmentTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
