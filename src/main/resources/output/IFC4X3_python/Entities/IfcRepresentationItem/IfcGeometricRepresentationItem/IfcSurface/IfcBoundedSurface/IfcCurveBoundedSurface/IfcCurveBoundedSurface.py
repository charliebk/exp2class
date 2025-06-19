class IfcCurveBoundedSurface(IfcBoundedSurface):
    def __init__(self):
        self.BasisSurface: IfcSurface = None
        self.Boundaries: SET [1:?] OF IfcBoundaryCurve = None
        self.ImplicitOuter: IfcBoolean = None
