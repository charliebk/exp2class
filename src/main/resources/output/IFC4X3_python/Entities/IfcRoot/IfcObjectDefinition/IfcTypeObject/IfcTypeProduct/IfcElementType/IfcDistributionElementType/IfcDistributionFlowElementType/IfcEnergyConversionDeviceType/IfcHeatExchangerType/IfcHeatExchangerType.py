class IfcHeatExchangerType(IfcEnergyConversionDeviceType):
    def __init__(self):
        self.PredefinedType: IfcHeatExchangerTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcHeatExchangerTypeEnum.USERDEFINED) OR ((PredefinedType = IfcHeatExchangerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
