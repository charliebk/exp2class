class IfcEdgeCurve(IfcEdge):
    def __init__(self):
        self.EdgeGeometry: IfcCurve = None
        self.SameSense: IfcBoolean = None
