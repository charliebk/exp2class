class IfcUnitaryControlElementType(IfcDistributionControlElementType):
    def __init__(self):
        self.PredefinedType: IfcUnitaryControlElementTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcUnitaryControlElementTypeEnum.USERDEFINED) OR ((PredefinedType = IfcUnitaryControlElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
