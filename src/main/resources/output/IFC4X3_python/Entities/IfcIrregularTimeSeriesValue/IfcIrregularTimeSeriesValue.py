from typing import List

class IfcIrregularTimeSeriesValue:
    def __init__(self):
        self.TimeStamp: IfcDateTime = None
        self.ListValues: List[IfcValue] = None
