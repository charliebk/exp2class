class IfcPointOnSurface(IfcPoint):
    def __init__(self):
        self.BasisSurface: IfcSurface = None
        self.PointParameterU: IfcParameterValue = None
        self.PointParameterV: IfcParameterValue = None
