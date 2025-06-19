class IfcLine(IfcCurve):
    def __init__(self):
        self.Pnt: IfcCartesianPoint = None
        self.Dir: IfcVector = None

    # === WHERE CLAUSES ===
    # SameDim : Dir.Dim = Pnt.Dim
