from typing import List

class IfcCartesianPointList3D(IfcCartesianPointList):
    def __init__(self):
        self.CoordList: List[List[IfcLengthMeasure]] = None
        self.TagList: List[IfcLabel] = None
