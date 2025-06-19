from typing import List

class IfcTextureCoordinateIndices:
    def __init__(self):
        self.TexCoordIndex: List[IfcPositiveInteger] = None
        self.TexCoordsOf: IfcIndexedPolygonalFace = None

    # === EXTENDED BY ===
    # IfcTextureCoordinateIndicesWithVoids

    # === INVERSE CLAUSES ===
    # ToTexMap : IfcIndexedPolygonalTextureMap FOR TexCoordIndices
