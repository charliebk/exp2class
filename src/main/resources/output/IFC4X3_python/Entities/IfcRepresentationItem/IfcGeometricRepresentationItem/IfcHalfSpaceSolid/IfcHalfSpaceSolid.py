class IfcHalfSpaceSolid(IfcGeometricRepresentationItem):
    def __init__(self):
        self.BaseSurface: IfcSurface = None
        self.AgreementFlag: IfcBoolean = None

    # === EXTENDED BY ===
    # IfcBoxedHalfSpace
    # IfcPolygonalBoundedHalfSpace

    # === DERIVE CLAUSES ===
    # Dim : IfcDimensionCount := 3
