class IfcElectricFlowTreatmentDeviceType(IfcFlowTreatmentDeviceType):
    def __init__(self):
        self.PredefinedType: IfcElectricFlowTreatmentDeviceTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcElectricFlowTreatmentDeviceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcElectricFlowTreatmentDeviceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
