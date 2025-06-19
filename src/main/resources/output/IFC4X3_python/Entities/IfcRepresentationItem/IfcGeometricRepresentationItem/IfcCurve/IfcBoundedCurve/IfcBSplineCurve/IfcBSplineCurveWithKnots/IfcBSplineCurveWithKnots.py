from typing import List

class IfcBSplineCurveWithKnots(IfcBSplineCurve):
    def __init__(self):
        self.KnotMultiplicities: List[IfcInteger] = None
        self.Knots: List[IfcParameterValue] = None
        self.KnotSpec: IfcKnotType = None

    # === EXTENDED BY ===
    # IfcRationalBSplineCurveWithKnots

    # === WHERE CLAUSES ===
    # ConsistentBSpline : IfcConstraintsParamBSpline(Degree, UpperIndexOnKnots, UpperIndexOnControlPoints, KnotMultiplicities, Knots)
    # CorrespondingKnotLists : SIZEOF(KnotMultiplicities) = UpperIndexOnKnots

    # === DERIVE CLAUSES ===
    # UpperIndexOnKnots : IfcInteger := SIZEOF(Knots)
