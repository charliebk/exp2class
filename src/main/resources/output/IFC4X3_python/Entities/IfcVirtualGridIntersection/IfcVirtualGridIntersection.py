from typing import List

class IfcVirtualGridIntersection:
    def __init__(self):
        self.IntersectingAxes: List[UNIQUE IfcGridAxis] = None
        self.OffsetDistances: List[IfcLengthMeasure] = None
