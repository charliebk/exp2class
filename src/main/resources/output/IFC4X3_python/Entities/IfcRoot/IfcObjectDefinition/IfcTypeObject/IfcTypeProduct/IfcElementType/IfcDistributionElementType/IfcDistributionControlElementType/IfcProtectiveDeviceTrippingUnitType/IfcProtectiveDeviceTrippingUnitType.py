class IfcProtectiveDeviceTrippingUnitType(IfcDistributionControlElementType):
    def __init__(self):
        self.PredefinedType: IfcProtectiveDeviceTrippingUnitTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcProtectiveDeviceTrippingUnitTypeEnum.USERDEFINED) OR ((PredefinedType = IfcProtectiveDeviceTrippingUnitTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
