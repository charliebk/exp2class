class IfcShellBasedSurfaceModel(IfcGeometricRepresentationItem):
    def __init__(self):
        self.SbsmBoundary: SET [1:?] OF IfcShell = None

    # === DERIVE CLAUSES ===
    # Dim : IfcDimensionCount := 3
