class IfcResourceTime(IfcSchedulingTime):
    def __init__(self):
        self.ScheduleWork: IfcDuration = None
        self.ScheduleUsage: IfcPositiveRatioMeasure = None
        self.ScheduleStart: IfcDateTime = None
        self.ScheduleFinish: IfcDateTime = None
        self.ScheduleContour: IfcLabel = None
        self.LevelingDelay: IfcDuration = None
        self.IsOverAllocated: IfcBoolean = None
        self.StatusTime: IfcDateTime = None
        self.ActualWork: IfcDuration = None
        self.ActualUsage: IfcPositiveRatioMeasure = None
        self.ActualStart: IfcDateTime = None
        self.ActualFinish: IfcDateTime = None
        self.RemainingWork: IfcDuration = None
        self.RemainingUsage: IfcPositiveRatioMeasure = None
        self.Completion: IfcPositiveRatioMeasure = None
