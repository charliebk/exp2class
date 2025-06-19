class IfcControllerType(IfcDistributionControlElementType):
    def __init__(self):
        self.PredefinedType: IfcControllerTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcControllerTypeEnum.USERDEFINED) OR ((PredefinedType = IfcControllerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
