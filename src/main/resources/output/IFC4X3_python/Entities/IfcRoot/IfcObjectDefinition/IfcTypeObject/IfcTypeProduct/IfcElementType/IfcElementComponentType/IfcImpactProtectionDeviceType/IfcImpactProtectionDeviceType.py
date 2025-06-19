class IfcImpactProtectionDeviceType(IfcElementComponentType):
    def __init__(self):
        self.PredefinedType: IfcImpactProtectionDeviceTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcImpactProtectionDeviceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcImpactProtectionDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
