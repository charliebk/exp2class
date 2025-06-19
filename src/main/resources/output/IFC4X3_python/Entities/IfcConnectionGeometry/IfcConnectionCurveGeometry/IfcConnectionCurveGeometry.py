class IfcConnectionCurveGeometry(IfcConnectionGeometry):
    def __init__(self):
        self.CurveOnRelatingElement: IfcCurveOrEdgeCurve = None
        self.CurveOnRelatedElement: IfcCurveOrEdgeCurve = None
