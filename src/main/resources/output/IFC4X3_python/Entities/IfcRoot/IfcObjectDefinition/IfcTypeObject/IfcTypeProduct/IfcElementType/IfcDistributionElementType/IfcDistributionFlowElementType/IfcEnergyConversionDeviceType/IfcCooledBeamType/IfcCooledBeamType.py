class IfcCooledBeamType(IfcEnergyConversionDeviceType):
    def __init__(self):
        self.PredefinedType: IfcCooledBeamTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcCooledBeamTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCooledBeamTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
