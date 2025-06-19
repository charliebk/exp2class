class IfcElectricFlowStorageDeviceType(IfcFlowStorageDeviceType):
    def __init__(self):
        self.PredefinedType: IfcElectricFlowStorageDeviceTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcElectricFlowStorageDeviceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcElectricFlowStorageDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
