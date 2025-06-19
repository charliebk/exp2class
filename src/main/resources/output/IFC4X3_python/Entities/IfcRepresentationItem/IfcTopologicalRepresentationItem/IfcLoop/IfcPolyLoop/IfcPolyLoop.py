from typing import List

class IfcPolyLoop(IfcLoop):
    def __init__(self):
        self.Polygon: List[UNIQUE IfcCartesianPoint] = None

    # === WHERE CLAUSES ===
    # AllPointsSameDim : SIZEOF(QUERY(Temp <* Polygon | Temp.Dim <> Polygon[1].Dim)) = 0
