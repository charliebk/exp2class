class IfcPcurve(IfcCurve):
    def __init__(self):
        self.BasisSurface: IfcSurface = None
        self.ReferenceCurve: IfcCurve = None

    # === WHERE CLAUSES ===
    # DimIs2D : ReferenceCurve.Dim = 2
