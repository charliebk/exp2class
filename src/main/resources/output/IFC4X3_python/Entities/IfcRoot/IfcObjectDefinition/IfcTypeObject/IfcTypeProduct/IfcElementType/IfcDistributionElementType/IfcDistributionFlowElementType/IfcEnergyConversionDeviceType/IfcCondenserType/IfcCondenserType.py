class IfcCondenserType(IfcEnergyConversionDeviceType):
    def __init__(self):
        self.PredefinedType: IfcCondenserTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcCondenserTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCondenserTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
