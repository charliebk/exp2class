class IfcBurnerType(IfcEnergyConversionDeviceType):
    def __init__(self):
        self.PredefinedType: IfcBurnerTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcBurnerTypeEnum.USERDEFINED) OR ((PredefinedType = IfcBurnerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
