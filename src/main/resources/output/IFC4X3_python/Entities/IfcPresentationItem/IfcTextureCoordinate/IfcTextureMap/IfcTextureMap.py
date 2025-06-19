from typing import List

class IfcTextureMap(IfcTextureCoordinate):
    def __init__(self):
        self.Vertices: List[IfcTextureVertex] = None
        self.MappedTo: IfcFace = None
