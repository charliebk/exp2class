class IfcOffsetCurve3D(IfcOffsetCurve):
    def __init__(self):
        self.Distance: IfcLengthMeasure = None
        self.SelfIntersect: IfcLogical = None
        self.RefDirection: IfcDirection = None

    # === WHERE CLAUSES ===
    # DimIs2D : BasisCurve.Dim = 3
