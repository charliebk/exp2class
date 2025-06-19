class IfcDistributionChamberElementType(IfcDistributionFlowElementType):
    def __init__(self):
        self.PredefinedType: IfcDistributionChamberElementTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcDistributionChamberElementTypeEnum.USERDEFINED) OR ((PredefinedType = IfcDistributionChamberElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
