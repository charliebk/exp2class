class IfcMotorConnectionType(IfcEnergyConversionDeviceType):
    def __init__(self):
        self.PredefinedType: IfcMotorConnectionTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcMotorConnectionTypeEnum.USERDEFINED) OR ((PredefinedType = IfcMotorConnectionTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
