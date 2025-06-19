class IfcDuctFittingType(IfcFlowFittingType):
    def __init__(self):
        self.PredefinedType: IfcDuctFittingTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcDuctFittingTypeEnum.USERDEFINED) OR ((PredefinedType = IfcDuctFittingTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
