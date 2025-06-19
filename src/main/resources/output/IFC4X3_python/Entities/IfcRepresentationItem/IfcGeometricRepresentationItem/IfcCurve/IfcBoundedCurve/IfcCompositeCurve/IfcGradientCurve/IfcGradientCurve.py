class IfcGradientCurve(IfcCompositeCurve):
    def __init__(self):
        self.BaseCurve: IfcBoundedCurve = None
        self.EndPoint: IfcPlacement = None
