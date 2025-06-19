class IfcDamperType(IfcFlowControllerType):
    def __init__(self):
        self.PredefinedType: IfcDamperTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcDamperTypeEnum.USERDEFINED) OR ((PredefinedType = IfcDamperTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
