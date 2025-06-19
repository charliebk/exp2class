class IfcElectricMotorType(IfcEnergyConversionDeviceType):
    def __init__(self):
        self.PredefinedType: IfcElectricMotorTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcElectricMotorTypeEnum.USERDEFINED) OR ((PredefinedType = IfcElectricMotorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
