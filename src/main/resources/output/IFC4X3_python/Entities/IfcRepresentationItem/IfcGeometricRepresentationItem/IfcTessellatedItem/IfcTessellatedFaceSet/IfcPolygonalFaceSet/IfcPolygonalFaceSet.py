from typing import List

class IfcPolygonalFaceSet(IfcTessellatedFaceSet):
    def __init__(self):
        self.Closed: IfcBoolean = None
        self.Faces: List[UNIQUE IfcIndexedPolygonalFace] = None
        self.PnIndex: List[IfcPositiveInteger] = None
