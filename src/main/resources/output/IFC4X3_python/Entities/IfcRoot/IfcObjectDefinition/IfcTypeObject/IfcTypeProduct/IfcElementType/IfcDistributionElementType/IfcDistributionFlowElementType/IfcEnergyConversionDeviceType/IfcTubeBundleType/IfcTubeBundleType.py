class IfcTubeBundleType(IfcEnergyConversionDeviceType):
    def __init__(self):
        self.PredefinedType: IfcTubeBundleTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcTubeBundleTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTubeBundleTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
