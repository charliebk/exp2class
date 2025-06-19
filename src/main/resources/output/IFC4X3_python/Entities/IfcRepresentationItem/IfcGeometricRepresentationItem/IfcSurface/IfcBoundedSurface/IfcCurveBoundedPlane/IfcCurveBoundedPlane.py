class IfcCurveBoundedPlane(IfcBoundedSurface):
    def __init__(self):
        self.BasisSurface: IfcPlane = None
        self.OuterBoundary: IfcCurve = None
        self.InnerBoundaries: SET [0:?] OF IfcCurve = None
