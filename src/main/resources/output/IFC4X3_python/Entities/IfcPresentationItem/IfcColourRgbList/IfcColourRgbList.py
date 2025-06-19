from typing import List

class IfcColourRgbList(IfcPresentationItem):
    def __init__(self):
        self.ColourList: List[List[IfcNormalisedRatioMeasure]] = None
