class IfcTankType(IfcFlowStorageDeviceType):
    def __init__(self):
        self.PredefinedType: IfcTankTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcTankTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTankTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
