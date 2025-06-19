class IfcWorkCalendar(IfcControl):
    def __init__(self):
        self.WorkingTimes: SET [1:?] OF IfcWorkTime = None
        self.ExceptionTimes: SET [1:?] OF IfcWorkTime = None
        self.PredefinedType: IfcWorkCalendarTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcWorkCalendarTypeEnum.USERDEFINED) OR ((PredefinedType = IfcWorkCalendarTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcObject.ObjectType))
