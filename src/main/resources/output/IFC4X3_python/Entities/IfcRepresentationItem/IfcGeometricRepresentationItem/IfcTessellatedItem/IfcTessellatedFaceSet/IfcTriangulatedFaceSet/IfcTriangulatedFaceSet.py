from typing import List

class IfcTriangulatedFaceSet(IfcTessellatedFaceSet):
    def __init__(self):
        self.Normals: List[List[IfcParameterValue]] = None
        self.Closed: IfcBoolean = None
        self.CoordIndex: List[List[IfcPositiveInteger]] = None
        self.PnIndex: List[IfcPositiveInteger] = None

    # === EXTENDED BY ===
    # IfcTriangulatedIrregularNetwork

    # === DERIVE CLAUSES ===
    # NumberOfTriangles : IfcInteger := SIZEOF(CoordIndex)
