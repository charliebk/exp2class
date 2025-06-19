class IfcAudioVisualApplianceType(IfcFlowTerminalType):
    def __init__(self):
        self.PredefinedType: IfcAudioVisualApplianceTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcAudioVisualApplianceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcAudioVisualApplianceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
