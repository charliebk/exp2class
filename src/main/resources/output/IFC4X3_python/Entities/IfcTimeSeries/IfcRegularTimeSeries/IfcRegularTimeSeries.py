from typing import List

class IfcRegularTimeSeries(IfcTimeSeries):
    def __init__(self):
        self.TimeStep: IfcTimeMeasure = None
        self.Values: List[IfcTimeSeriesValue] = None
