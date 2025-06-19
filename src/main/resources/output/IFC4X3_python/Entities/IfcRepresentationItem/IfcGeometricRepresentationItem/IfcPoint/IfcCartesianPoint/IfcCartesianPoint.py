from typing import List

class IfcCartesianPoint(IfcPoint):
    def __init__(self):
        self.Coordinates: List[IfcLengthMeasure] = None

    # === WHERE CLAUSES ===
    # CP2Dor3D : HIINDEX(Coordinates) >= 2
