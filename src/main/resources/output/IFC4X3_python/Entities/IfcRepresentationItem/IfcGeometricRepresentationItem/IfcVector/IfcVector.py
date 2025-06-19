class IfcVector(IfcGeometricRepresentationItem):
    def __init__(self):
        self.Orientation: IfcDirection = None
        self.Magnitude: IfcLengthMeasure = None

    # === WHERE CLAUSES ===
    # MagGreaterOrEqualZero : Magnitude >= 0.0

    # === DERIVE CLAUSES ===
    # Dim : IfcDimensionCount := Orientation.Dim
