class IfcEventTime(IfcSchedulingTime):
    def __init__(self):
        self.ActualDate: IfcDateTime = None
        self.EarlyDate: IfcDateTime = None
        self.LateDate: IfcDateTime = None
        self.ScheduleDate: IfcDateTime = None
