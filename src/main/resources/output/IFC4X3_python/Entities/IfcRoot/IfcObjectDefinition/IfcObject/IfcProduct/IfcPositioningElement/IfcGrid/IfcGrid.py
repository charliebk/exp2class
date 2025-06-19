from typing import List

class IfcGrid(IfcPositioningElement):
    def __init__(self):
        self.UAxes: List[UNIQUE IfcGridAxis] = None
        self.VAxes: List[UNIQUE IfcGridAxis] = None
        self.WAxes: List[UNIQUE IfcGridAxis] = None
        self.PredefinedType: IfcGridTypeEnum = None
