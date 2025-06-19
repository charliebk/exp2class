class IfcCostSchedule(IfcControl):
    def __init__(self):
        self.PredefinedType: IfcCostScheduleTypeEnum = None
        self.Status: IfcLabel = None
        self.SubmittedOn: IfcDateTime = None
        self.UpdateDate: IfcDateTime = None
