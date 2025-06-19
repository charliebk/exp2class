class IfcIndexedPolygonalTextureMap(IfcIndexedTextureMap):
    def __init__(self):
        self.TexCoordIndices: SET [1:?] OF IfcTextureCoordinateIndices = None
