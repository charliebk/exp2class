class IfcJunctionBoxType(IfcFlowFittingType):
    def __init__(self):
        self.PredefinedType: IfcJunctionBoxTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcJunctionBoxTypeEnum.USERDEFINED) OR ((PredefinedType = IfcJunctionBoxTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
