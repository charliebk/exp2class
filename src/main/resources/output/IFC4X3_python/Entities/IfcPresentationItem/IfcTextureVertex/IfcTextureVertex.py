from typing import List

class IfcTextureVertex(IfcPresentationItem):
    def __init__(self):
        self.Coordinates: List[IfcParameterValue] = None
