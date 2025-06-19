class IfcDuctSilencerType(IfcFlowTreatmentDeviceType):
    def __init__(self):
        self.PredefinedType: IfcDuctSilencerTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcDuctSilencerTypeEnum.USERDEFINED) OR ((PredefinedType = IfcDuctSilencerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
