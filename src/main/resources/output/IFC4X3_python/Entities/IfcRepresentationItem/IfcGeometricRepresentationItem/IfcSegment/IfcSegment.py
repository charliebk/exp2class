class IfcSegment(IfcGeometricRepresentationItem):
    def __init__(self):
        self.Transition: IfcTransitionCode = None

    # === EXTENDED BY ===
    # IfcCompositeCurveSegment
    # IfcCurveSegment

    # === INVERSE CLAUSES ===
    # UsingCurves : SET [1:?] OF IfcCompositeCurve FOR Segments

    # === DERIVE CLAUSES ===
    # Dim : IfcDimensionCount := IfcSegmentDim(SELF)
