class IfcSolarDeviceType(IfcEnergyConversionDeviceType):
    def __init__(self):
        self.PredefinedType: IfcSolarDeviceTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcSolarDeviceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSolarDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
