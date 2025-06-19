from typing import List

class IfcSurfaceStyleWithTextures(IfcPresentationItem):
    def __init__(self):
        self.Textures: List[IfcSurfaceTexture] = None
