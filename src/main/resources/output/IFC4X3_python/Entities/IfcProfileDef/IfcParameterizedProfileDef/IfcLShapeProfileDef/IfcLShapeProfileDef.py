class IfcLShapeProfileDef(IfcParameterizedProfileDef):
    def __init__(self):
        self.Depth: IfcPositiveLengthMeasure = None
        self.Width: IfcPositiveLengthMeasure = None
        self.Thickness: IfcPositiveLengthMeasure = None
        self.FilletRadius: IfcNonNegativeLengthMeasure = None
        self.EdgeRadius: IfcNonNegativeLengthMeasure = None
        self.LegSlope: IfcPlaneAngleMeasure = None

    # === WHERE CLAUSES ===
    # ValidThickness : (Thickness < Depth) AND (NOT(EXISTS(Width)) OR (Thickness < Width))
