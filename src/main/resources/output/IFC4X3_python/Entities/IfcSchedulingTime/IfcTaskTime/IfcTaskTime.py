class IfcTaskTime(IfcSchedulingTime):
    def __init__(self):
        self.DurationType: IfcTaskDurationEnum = None
        self.ScheduleDuration: IfcDuration = None
        self.ScheduleStart: IfcDateTime = None
        self.ScheduleFinish: IfcDateTime = None
        self.EarlyStart: IfcDateTime = None
        self.EarlyFinish: IfcDateTime = None
        self.LateStart: IfcDateTime = None
        self.LateFinish: IfcDateTime = None
        self.FreeFloat: IfcDuration = None
        self.TotalFloat: IfcDuration = None
        self.IsCritical: IfcBoolean = None
        self.StatusTime: IfcDateTime = None
        self.ActualDuration: IfcDuration = None
        self.ActualStart: IfcDateTime = None
        self.ActualFinish: IfcDateTime = None
        self.RemainingTime: IfcDuration = None
        self.Completion: IfcPositiveRatioMeasure = None

    # === EXTENDED BY ===
    # IfcTaskTimeRecurring
