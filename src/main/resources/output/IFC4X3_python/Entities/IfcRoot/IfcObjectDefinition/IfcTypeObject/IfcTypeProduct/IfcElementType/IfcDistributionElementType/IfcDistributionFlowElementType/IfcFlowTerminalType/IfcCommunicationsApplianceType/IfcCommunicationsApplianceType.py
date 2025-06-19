class IfcCommunicationsApplianceType(IfcFlowTerminalType):
    def __init__(self):
        self.PredefinedType: IfcCommunicationsApplianceTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcCommunicationsApplianceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCommunicationsApplianceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
