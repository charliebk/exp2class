from typing import List

class IfcPolynomialCurve(IfcCurve):
    def __init__(self):
        self.Position: IfcPlacement = None
        self.CoefficientsX: List[IfcReal] = None
        self.CoefficientsY: List[IfcReal] = None
        self.CoefficientsZ: List[IfcReal] = None

    # === WHERE CLAUSES ===
    # CorrectPositionDim : ((Position.Dim=2) AND (NOT EXISTS(CoefficientsZ))) OR (Position.Dim=3)
    # ValidCoefficients : (EXISTS(CoefficientsX) AND EXISTS(CoefficientsY)) OR (EXISTS(CoefficientsX) AND EXISTS(CoefficientsZ)) OR (EXISTS(CoefficientsY) AND EXISTS(CoefficientsZ)) OR (EXISTS(CoefficientsX) AND EXISTS(CoefficientsY) AND EXISTS(CoefficientsZ))
