from typing import List

class IfcSurfaceTexture(IfcPresentationItem):
    def __init__(self):
        self.RepeatS: IfcBoolean = None
        self.RepeatT: IfcBoolean = None
        self.Mode: IfcIdentifier = None
        self.TextureTransform: IfcCartesianTransformationOperator2D = None
        self.Parameter: List[IfcIdentifier] = None

    # === EXTENDED BY ===
    # IfcBlobTexture
    # IfcImageTexture
    # IfcPixelTexture

    # === INVERSE CLAUSES ===
    # IsMappedBy : SET [0:?] OF IfcTextureCoordinate FOR Maps
    # UsedInStyles : SET [0:?] OF IfcSurfaceStyleWithTextures FOR Textures
