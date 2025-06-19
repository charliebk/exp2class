from typing import List

class IfcIndexedPolygonalFaceWithVoids(IfcIndexedPolygonalFace):
    def __init__(self):
        self.InnerCoordIndices: List[List[UNIQUE IfcPositiveInteger]] = None
