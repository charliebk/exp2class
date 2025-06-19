class IfcAirToAirHeatRecoveryType(IfcEnergyConversionDeviceType):
    def __init__(self):
        self.PredefinedType: IfcAirToAirHeatRecoveryTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcAirToAirHeatRecoveryTypeEnum.USERDEFINED) OR ((PredefinedType = IfcAirToAirHeatRecoveryTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
