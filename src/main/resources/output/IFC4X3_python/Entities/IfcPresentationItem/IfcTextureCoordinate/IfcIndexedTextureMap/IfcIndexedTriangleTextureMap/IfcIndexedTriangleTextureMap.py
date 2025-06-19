from typing import List

class IfcIndexedTriangleTextureMap(IfcIndexedTextureMap):
    def __init__(self):
        self.TexCoordIndex: List[List[IfcPositiveInteger]] = None
