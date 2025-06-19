from typing import List

class IfcOffsetCurveByDistances(IfcOffsetCurve):
    def __init__(self):
        self.OffsetValues: List[IfcPointByDistanceExpression] = None
        self.Tag: IfcLabel = None
