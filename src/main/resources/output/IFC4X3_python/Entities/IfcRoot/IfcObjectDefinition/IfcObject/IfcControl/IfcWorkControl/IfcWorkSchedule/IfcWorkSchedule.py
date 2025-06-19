class IfcWorkSchedule(IfcWorkControl):
    def __init__(self):
        self.PredefinedType: IfcWorkScheduleTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcWorkScheduleTypeEnum.USERDEFINED) OR ((PredefinedType = IfcWorkScheduleTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcObject.ObjectType))
