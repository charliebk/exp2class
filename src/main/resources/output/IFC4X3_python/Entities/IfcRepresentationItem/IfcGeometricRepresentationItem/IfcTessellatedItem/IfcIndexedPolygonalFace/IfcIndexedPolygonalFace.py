from typing import List

class IfcIndexedPolygonalFace(IfcTessellatedItem):
    def __init__(self):
        self.CoordIndex: List[IfcPositiveInteger] = None

    # === EXTENDED BY ===
    # IfcIndexedPolygonalFaceWithVoids

    # === INVERSE CLAUSES ===
    # ToFaceSet : SET [1:?] OF IfcPolygonalFaceSet FOR Faces
    # HasTexCoords : SET [0:1] OF IfcTextureCoordinateIndices FOR TexCoordsOf
