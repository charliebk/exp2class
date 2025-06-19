class IfcWorkTime(IfcSchedulingTime):
    def __init__(self):
        self.RecurrencePattern: IfcRecurrencePattern = None
        self.StartDate: IfcDate = None
        self.FinishDate: IfcDate = None
