class IfcCurveSegment(IfcSegment):
    def __init__(self):
        self.Placement: IfcPlacement = None
        self.SegmentStart: IfcCurveMeasureSelect = None
        self.SegmentLength: IfcCurveMeasureSelect = None
        self.ParentCurve: IfcCurve = None
