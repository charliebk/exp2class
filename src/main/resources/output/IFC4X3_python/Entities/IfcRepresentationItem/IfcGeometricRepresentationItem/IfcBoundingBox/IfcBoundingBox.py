class IfcBoundingBox(IfcGeometricRepresentationItem):
    def __init__(self):
        self.Corner: IfcCartesianPoint = None
        self.XDim: IfcPositiveLengthMeasure = None
        self.YDim: IfcPositiveLengthMeasure = None
        self.ZDim: IfcPositiveLengthMeasure = None

    # === DERIVE CLAUSES ===
    # Dim : IfcDimensionCount := 3
