class IfcElectricGeneratorType(IfcEnergyConversionDeviceType):
    def __init__(self):
        self.PredefinedType: IfcElectricGeneratorTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcElectricGeneratorTypeEnum.USERDEFINED) OR ((PredefinedType = IfcElectricGeneratorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
