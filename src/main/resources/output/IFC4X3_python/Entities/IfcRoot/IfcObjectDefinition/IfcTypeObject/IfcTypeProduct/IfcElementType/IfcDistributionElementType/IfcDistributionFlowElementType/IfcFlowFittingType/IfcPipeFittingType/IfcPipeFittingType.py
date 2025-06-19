class IfcPipeFittingType(IfcFlowFittingType):
    def __init__(self):
        self.PredefinedType: IfcPipeFittingTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcPipeFittingTypeEnum.USERDEFINED) OR ((PredefinedType = IfcPipeFittingTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
