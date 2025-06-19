class IfcValveType(IfcFlowControllerType):
    def __init__(self):
        self.PredefinedType: IfcValveTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcValveTypeEnum.USERDEFINED) OR ((PredefinedType = IfcValveTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
