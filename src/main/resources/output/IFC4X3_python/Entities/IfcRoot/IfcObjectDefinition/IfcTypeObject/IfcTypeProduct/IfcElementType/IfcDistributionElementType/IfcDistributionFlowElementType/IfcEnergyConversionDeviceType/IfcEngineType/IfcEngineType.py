class IfcEngineType(IfcEnergyConversionDeviceType):
    def __init__(self):
        self.PredefinedType: IfcEngineTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcEngineTypeEnum.USERDEFINED) OR ((PredefinedType = IfcEngineTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
