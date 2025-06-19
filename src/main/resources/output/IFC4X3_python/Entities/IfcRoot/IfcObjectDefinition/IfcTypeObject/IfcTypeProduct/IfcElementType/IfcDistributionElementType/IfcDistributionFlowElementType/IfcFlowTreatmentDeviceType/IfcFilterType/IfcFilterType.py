class IfcFilterType(IfcFlowTreatmentDeviceType):
    def __init__(self):
        self.PredefinedType: IfcFilterTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcFilterTypeEnum.USERDEFINED) OR ((PredefinedType = IfcFilterTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
