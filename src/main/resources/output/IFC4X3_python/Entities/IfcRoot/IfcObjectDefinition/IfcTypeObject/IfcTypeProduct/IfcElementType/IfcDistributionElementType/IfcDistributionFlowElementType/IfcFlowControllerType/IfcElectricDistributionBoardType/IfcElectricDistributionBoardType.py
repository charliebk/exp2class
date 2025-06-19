class IfcElectricDistributionBoardType(IfcFlowControllerType):
    def __init__(self):
        self.PredefinedType: IfcElectricDistributionBoardTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcElectricDistributionBoardTypeEnum.USERDEFINED) OR ((PredefinedType = IfcElectricDistributionBoardTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
