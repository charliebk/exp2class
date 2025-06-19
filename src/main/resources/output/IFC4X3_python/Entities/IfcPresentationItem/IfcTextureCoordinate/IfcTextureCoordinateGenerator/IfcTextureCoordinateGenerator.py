from typing import List

class IfcTextureCoordinateGenerator(IfcTextureCoordinate):
    def __init__(self):
        self.Mode: IfcLabel = None
        self.Parameter: List[IfcReal] = None
