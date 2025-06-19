class IfcWorkControl(IfcControl):
    def __init__(self):
        self.CreationDate: IfcDateTime = None
        self.Creators: SET [1:?] OF IfcPerson = None
        self.Purpose: IfcLabel = None
        self.Duration: IfcDuration = None
        self.TotalFloat: IfcDuration = None
        self.StartTime: IfcDateTime = None
        self.FinishTime: IfcDateTime = None

    # === EXTENDED BY ===
    # IfcWorkPlan
    # IfcWorkSchedule
