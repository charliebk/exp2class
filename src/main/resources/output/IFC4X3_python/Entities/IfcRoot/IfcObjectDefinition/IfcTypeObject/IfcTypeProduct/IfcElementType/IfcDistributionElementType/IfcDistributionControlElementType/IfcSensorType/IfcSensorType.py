class IfcSensorType(IfcDistributionControlElementType):
    def __init__(self):
        self.PredefinedType: IfcSensorTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcSensorTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSensorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
