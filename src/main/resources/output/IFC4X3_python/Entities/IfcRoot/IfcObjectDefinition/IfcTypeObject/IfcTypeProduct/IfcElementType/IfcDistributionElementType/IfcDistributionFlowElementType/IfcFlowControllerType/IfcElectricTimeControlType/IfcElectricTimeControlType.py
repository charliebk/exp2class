class IfcElectricTimeControlType(IfcFlowControllerType):
    def __init__(self):
        self.PredefinedType: IfcElectricTimeControlTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcElectricTimeControlTypeEnum.USERDEFINED) OR ((PredefinedType = IfcElectricTimeControlTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
