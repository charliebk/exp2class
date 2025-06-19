from typing import List

class IfcIndexedColourMap(IfcPresentationItem):
    def __init__(self):
        self.MappedTo: IfcTessellatedFaceSet = None
        self.Opacity: IfcNormalisedRatioMeasure = None
        self.Colours: IfcColourRgbList = None
        self.ColourIndex: List[IfcPositiveInteger] = None
