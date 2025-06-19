class IfcPointOnCurve(IfcPoint):
    def __init__(self):
        self.BasisCurve: IfcCurve = None
        self.PointParameter: IfcParameterValue = None
