class IfcElectricApplianceType(IfcFlowTerminalType):
    def __init__(self):
        self.PredefinedType: IfcElectricApplianceTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcElectricApplianceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcElectricApplianceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
