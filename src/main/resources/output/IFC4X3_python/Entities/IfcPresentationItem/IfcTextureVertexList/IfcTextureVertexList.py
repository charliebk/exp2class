from typing import List

class IfcTextureVertexList(IfcPresentationItem):
    def __init__(self):
        self.TexCoordsList: List[List[IfcParameterValue]] = None
