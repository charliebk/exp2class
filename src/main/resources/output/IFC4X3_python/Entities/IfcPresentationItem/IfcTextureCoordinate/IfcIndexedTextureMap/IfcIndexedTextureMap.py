class IfcIndexedTextureMap(IfcTextureCoordinate):
    def __init__(self):
        self.MappedTo: IfcTessellatedFaceSet = None
        self.TexCoords: IfcTextureVertexList = None

    # === EXTENDED BY ===
    # IfcIndexedPolygonalTextureMap
    # IfcIndexedTriangleTextureMap
