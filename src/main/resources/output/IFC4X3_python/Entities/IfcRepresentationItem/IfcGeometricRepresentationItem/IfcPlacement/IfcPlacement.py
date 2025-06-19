class IfcPlacement(IfcGeometricRepresentationItem):
    def __init__(self):
        self.Location: IfcPoint = None

    # === EXTENDED BY ===
    # IfcAxis1Placement
    # IfcAxis2Placement2D
    # IfcAxis2Placement3D
    # IfcAxis2PlacementLinear

    # === DERIVE CLAUSES ===
    # Dim : IfcDimensionCount := Location.Dim
