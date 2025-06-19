class IfcChillerType(IfcEnergyConversionDeviceType):
    def __init__(self):
        self.PredefinedType: IfcChillerTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcChillerTypeEnum.USERDEFINED) OR ((PredefinedType = IfcChillerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
