class IfcMooringDeviceType(IfcBuiltElementType):
    def __init__(self):
        self.PredefinedType: IfcMooringDeviceTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcMooringDeviceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcMooringDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
