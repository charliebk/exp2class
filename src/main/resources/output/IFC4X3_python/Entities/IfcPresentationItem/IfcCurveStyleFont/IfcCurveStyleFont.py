from typing import List

class IfcCurveStyleFont(IfcPresentationItem):
    def __init__(self):
        self.Name: IfcLabel = None
        self.PatternList: List[IfcCurveStyleFontPattern] = None
