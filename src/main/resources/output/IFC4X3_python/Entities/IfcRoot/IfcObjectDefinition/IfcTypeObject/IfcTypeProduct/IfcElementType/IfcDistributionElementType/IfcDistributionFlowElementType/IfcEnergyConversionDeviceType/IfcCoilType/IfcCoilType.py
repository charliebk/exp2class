class IfcCoilType(IfcEnergyConversionDeviceType):
    def __init__(self):
        self.PredefinedType: IfcCoilTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcCoilTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCoilTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
