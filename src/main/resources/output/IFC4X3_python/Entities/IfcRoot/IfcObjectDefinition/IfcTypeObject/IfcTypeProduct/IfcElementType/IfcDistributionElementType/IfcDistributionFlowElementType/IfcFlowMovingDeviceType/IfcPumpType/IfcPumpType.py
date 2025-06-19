class IfcPumpType(IfcFlowMovingDeviceType):
    def __init__(self):
        self.PredefinedType: IfcPumpTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcPumpTypeEnum.USERDEFINED) OR ((PredefinedType = IfcPumpTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
