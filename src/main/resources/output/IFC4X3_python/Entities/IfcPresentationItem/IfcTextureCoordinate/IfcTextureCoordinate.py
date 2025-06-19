from typing import List

class IfcTextureCoordinate(IfcPresentationItem):
    def __init__(self):
        self.Maps: List[IfcSurfaceTexture] = None

    # === EXTENDED BY ===
    # IfcIndexedTextureMap
    # IfcTextureCoordinateGenerator
    # IfcTextureMap
