from typing import List

class IfcTriangulatedIrregularNetwork(IfcTriangulatedFaceSet):
    def __init__(self):
        self.Flags: List[IfcInteger] = None

    # === WHERE CLAUSES ===
    # NotClosed : SELF\IfcTriangulatedFaceSet.Closed = FALSE
