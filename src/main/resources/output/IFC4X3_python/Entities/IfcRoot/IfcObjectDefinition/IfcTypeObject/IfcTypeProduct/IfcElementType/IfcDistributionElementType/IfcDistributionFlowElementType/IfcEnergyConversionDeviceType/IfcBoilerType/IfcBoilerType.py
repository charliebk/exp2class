class IfcBoilerType(IfcEnergyConversionDeviceType):
    def __init__(self):
        self.PredefinedType: IfcBoilerTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcBoilerTypeEnum.USERDEFINED) OR ((PredefinedType = IfcBoilerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
