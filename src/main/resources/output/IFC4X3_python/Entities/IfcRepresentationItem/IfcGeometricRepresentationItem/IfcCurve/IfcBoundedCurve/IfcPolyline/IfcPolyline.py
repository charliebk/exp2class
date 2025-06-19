from typing import List

class IfcPolyline(IfcBoundedCurve):
    def __init__(self):
        self.Points: List[IfcCartesianPoint] = None

    # === WHERE CLAUSES ===
    # SameDim : SIZEOF(QUERY(Temp <* Points | Temp.Dim <> Points[1].Dim)) = 0
