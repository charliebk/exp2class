class IfcPointByDistanceExpression(IfcPoint):
    def __init__(self):
        self.DistanceAlong: IfcCurveMeasureSelect = None
        self.OffsetLateral: IfcLengthMeasure = None
        self.OffsetVertical: IfcLengthMeasure = None
        self.OffsetLongitudinal: IfcLengthMeasure = None
        self.BasisCurve: IfcCurve = None
