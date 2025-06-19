from typing import List

class IfcIrregularTimeSeries(IfcTimeSeries):
    def __init__(self):
        self.Values: List[IfcIrregularTimeSeriesValue] = None
