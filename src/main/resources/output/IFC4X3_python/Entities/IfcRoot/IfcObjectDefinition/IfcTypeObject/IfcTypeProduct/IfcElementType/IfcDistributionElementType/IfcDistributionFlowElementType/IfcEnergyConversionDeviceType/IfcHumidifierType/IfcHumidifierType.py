class IfcHumidifierType(IfcEnergyConversionDeviceType):
    def __init__(self):
        self.PredefinedType: IfcHumidifierTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcHumidifierTypeEnum.USERDEFINED) OR ((PredefinedType = IfcHumidifierTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
