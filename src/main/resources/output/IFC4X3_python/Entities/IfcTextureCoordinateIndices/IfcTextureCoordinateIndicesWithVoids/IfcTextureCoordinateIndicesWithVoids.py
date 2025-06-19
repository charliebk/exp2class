from typing import List

class IfcTextureCoordinateIndicesWithVoids(IfcTextureCoordinateIndices):
    def __init__(self):
        self.InnerTexCoordIndices: List[List[UNIQUE IfcPositiveInteger]] = None
