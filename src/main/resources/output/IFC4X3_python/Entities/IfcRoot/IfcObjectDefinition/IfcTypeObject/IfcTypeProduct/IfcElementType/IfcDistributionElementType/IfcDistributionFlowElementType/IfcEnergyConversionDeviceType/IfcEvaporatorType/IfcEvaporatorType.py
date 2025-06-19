class IfcEvaporatorType(IfcEnergyConversionDeviceType):
    def __init__(self):
        self.PredefinedType: IfcEvaporatorTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcEvaporatorTypeEnum.USERDEFINED) OR ((PredefinedType = IfcEvaporatorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
