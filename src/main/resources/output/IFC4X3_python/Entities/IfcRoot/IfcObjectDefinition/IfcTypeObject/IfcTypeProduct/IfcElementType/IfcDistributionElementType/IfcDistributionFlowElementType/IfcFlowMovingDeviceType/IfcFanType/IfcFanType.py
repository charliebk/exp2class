class IfcFanType(IfcFlowMovingDeviceType):
    def __init__(self):
        self.PredefinedType: IfcFanTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcFanTypeEnum.USERDEFINED) OR ((PredefinedType = IfcFanTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
