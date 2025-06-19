from typing import List

class IfcRationalBSplineCurveWithKnots(IfcBSplineCurveWithKnots):
    def __init__(self):
        self.WeightsData: List[IfcReal] = None

    # === WHERE CLAUSES ===
    # SameNumOfWeightsAndPoints : SIZEOF(WeightsData) = SIZEOF(SELF\IfcBSplineCurve.ControlPointsList)
    # WeightsGreaterZero : IfcCurveWeightsPositive(SELF)

    # === DERIVE CLAUSES ===
    # Weights : ARRAY [0:UpperIndexOnControlPoints] OF IfcReal := IfcListToArray(WeightsData,0,SELF\IfcBSplineCurve.UpperIndexOnControlPoints)
