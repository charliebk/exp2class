class IfcOffsetCurve(IfcCurve):
    def __init__(self):
        self.BasisCurve: IfcCurve = None

    # === EXTENDED BY ===
    # IfcOffsetCurve2D
    # IfcOffsetCurve3D
    # IfcOffsetCurveByDistances
