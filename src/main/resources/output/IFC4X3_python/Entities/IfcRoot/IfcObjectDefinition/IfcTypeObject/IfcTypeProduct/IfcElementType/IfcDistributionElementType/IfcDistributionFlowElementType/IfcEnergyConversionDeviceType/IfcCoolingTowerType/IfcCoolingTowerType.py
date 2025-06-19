class IfcCoolingTowerType(IfcEnergyConversionDeviceType):
    def __init__(self):
        self.PredefinedType: IfcCoolingTowerTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcCoolingTowerTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCoolingTowerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
