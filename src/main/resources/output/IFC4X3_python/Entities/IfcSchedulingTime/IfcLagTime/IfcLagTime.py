class IfcLagTime(IfcSchedulingTime):
    def __init__(self):
        self.LagValue: IfcTimeOrRatioSelect = None
        self.DurationType: IfcTaskDurationEnum = None
