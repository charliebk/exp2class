class IfcMobileTelecommunicationsApplianceType(IfcFlowTerminalType):
    def __init__(self):
        self.PredefinedType: IfcMobileTelecommunicationsApplianceTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcMobileTelecommunicationsApplianceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcMobileTelecommunicationsApplianceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
