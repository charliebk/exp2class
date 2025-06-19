class IfcCurveStyleFontPattern(IfcPresentationItem):
    def __init__(self):
        self.VisibleSegmentLength: IfcLengthMeasure = None
        self.InvisibleSegmentLength: IfcPositiveLengthMeasure = None

    # === WHERE CLAUSES ===
    # VisibleLengthGreaterEqualZero : VisibleSegmentLength >= 0.
