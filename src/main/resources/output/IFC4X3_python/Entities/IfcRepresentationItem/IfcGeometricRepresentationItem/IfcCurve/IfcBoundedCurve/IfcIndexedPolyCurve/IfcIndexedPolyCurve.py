from typing import List

class IfcIndexedPolyCurve(IfcBoundedCurve):
    def __init__(self):
        self.Points: IfcCartesianPointList = None
        self.Segments: List[IfcSegmentIndexSelect] = None
        self.SelfIntersect: IfcBoolean = None

    # === WHERE CLAUSES ===
    # Consecutive : NOT(EXISTS(Segments)) OR IfcConsecutiveSegments(Segments)
