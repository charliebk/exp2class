from typing import List

class IfcBSplineCurve(IfcBoundedCurve):
    def __init__(self):
        self.Degree: IfcInteger = None
        self.ControlPointsList: List[IfcCartesianPoint] = None
        self.CurveForm: IfcBSplineCurveForm = None
        self.ClosedCurve: IfcLogical = None
        self.SelfIntersect: IfcLogical = None

    # === EXTENDED BY ===
    # IfcBSplineCurveWithKnots

    # === WHERE CLAUSES ===
    # SameDim : SIZEOF(QUERY(Temp <* ControlPointsList | Temp.Dim <> ControlPointsList[1].Dim)) = 0

    # === DERIVE CLAUSES ===
    # UpperIndexOnControlPoints : IfcInteger := (SIZEOF(ControlPointsList) - 1)
    # ControlPoints : ARRAY [0:UpperIndexOnControlPoints] OF IfcCartesianPoint := IfcListToArray(ControlPointsList,0,UpperIndexOnControlPoints)
