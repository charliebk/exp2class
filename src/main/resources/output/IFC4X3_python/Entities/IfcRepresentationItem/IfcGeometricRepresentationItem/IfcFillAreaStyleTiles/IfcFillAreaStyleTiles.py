from typing import List

class IfcFillAreaStyleTiles(IfcGeometricRepresentationItem):
    def __init__(self):
        self.TilingPattern: List[IfcVector] = None
        self.Tiles: SET [1:?] OF IfcStyledItem = None
        self.TilingScale: IfcPositiveRatioMeasure = None
