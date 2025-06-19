class IfcTaskTimeRecurring(IfcTaskTime):
    def __init__(self):
        self.Recurrence: IfcRecurrencePattern = None
