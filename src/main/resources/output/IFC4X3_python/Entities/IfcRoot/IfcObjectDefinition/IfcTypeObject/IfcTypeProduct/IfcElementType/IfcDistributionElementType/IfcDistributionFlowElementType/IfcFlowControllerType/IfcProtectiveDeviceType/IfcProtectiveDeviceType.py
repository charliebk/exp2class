class IfcProtectiveDeviceType(IfcFlowControllerType):
    def __init__(self):
        self.PredefinedType: IfcProtectiveDeviceTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcProtectiveDeviceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcProtectiveDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
