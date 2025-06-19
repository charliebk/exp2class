class IfcAlarmType(IfcDistributionControlElementType):
    def __init__(self):
        self.PredefinedType: IfcAlarmTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcAlarmTypeEnum.USERDEFINED) OR ((PredefinedType = IfcAlarmTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
