class IfcOffsetCurve2D(IfcOffsetCurve):
    def __init__(self):
        self.Distance: IfcLengthMeasure = None
        self.SelfIntersect: IfcLogical = None

    # === WHERE CLAUSES ===
    # DimIs2D : BasisCurve.Dim = 2
