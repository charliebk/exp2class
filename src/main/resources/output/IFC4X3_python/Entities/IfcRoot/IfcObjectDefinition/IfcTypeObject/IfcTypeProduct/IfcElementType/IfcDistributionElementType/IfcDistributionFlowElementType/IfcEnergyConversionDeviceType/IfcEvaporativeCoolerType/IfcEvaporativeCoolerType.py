class IfcEvaporativeCoolerType(IfcEnergyConversionDeviceType):
    def __init__(self):
        self.PredefinedType: IfcEvaporativeCoolerTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcEvaporativeCoolerTypeEnum.USERDEFINED) OR ((PredefinedType = IfcEvaporativeCoolerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
