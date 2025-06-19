class IfcShadingDeviceType(IfcBuiltElementType):
    def __init__(self):
        self.PredefinedType: IfcShadingDeviceTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcShadingDeviceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcShadingDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
