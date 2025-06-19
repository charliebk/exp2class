class IfcTransformerType(IfcEnergyConversionDeviceType):
    def __init__(self):
        self.PredefinedType: IfcTransformerTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcTransformerTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTransformerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
