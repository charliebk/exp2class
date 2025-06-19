class IfcFillAreaStyleHatching(IfcGeometricRepresentationItem):
    def __init__(self):
        self.HatchLineAppearance: IfcCurveStyle = None
        self.StartOfNextHatchLine: IfcHatchLineDistanceSelect = None
        self.PointOfReferenceHatchLine: IfcCartesianPoint = None
        self.PatternStart: IfcCartesianPoint = None
        self.HatchLineAngle: IfcPlaneAngleMeasure = None

    # === WHERE CLAUSES ===
    # PatternStart2D : NOT(EXISTS(PatternStart)) OR (PatternStart.Dim = 2)
    # RefHatchLine2D : NOT(EXISTS(PointOfReferenceHatchLine)) OR (PointOfReferenceHatchLine.Dim = 2)
