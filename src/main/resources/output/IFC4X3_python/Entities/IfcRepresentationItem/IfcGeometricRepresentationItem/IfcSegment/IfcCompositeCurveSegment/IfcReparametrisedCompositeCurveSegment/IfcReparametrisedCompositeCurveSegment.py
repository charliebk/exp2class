class IfcReparametrisedCompositeCurveSegment(IfcCompositeCurveSegment):
    def __init__(self):
        self.ParamLength: IfcParameterValue = None

    # === WHERE CLAUSES ===
    # PositiveLengthParameter : ParamLength > 0.0
