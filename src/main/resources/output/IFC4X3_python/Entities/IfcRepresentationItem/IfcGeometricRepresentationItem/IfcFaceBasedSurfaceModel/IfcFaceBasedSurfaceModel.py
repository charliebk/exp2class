class IfcFaceBasedSurfaceModel(IfcGeometricRepresentationItem):
    def __init__(self):
        self.FbsmFaces: SET [1:?] OF IfcConnectedFaceSet = None

    # === DERIVE CLAUSES ===
    # Dim : IfcDimensionCount := 3
