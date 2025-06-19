class IfcUnitaryEquipmentType(IfcEnergyConversionDeviceType):
    def __init__(self):
        self.PredefinedType: IfcUnitaryEquipmentTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcUnitaryEquipmentTypeEnum.USERDEFINED) OR ((PredefinedType = IfcUnitaryEquipmentTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
