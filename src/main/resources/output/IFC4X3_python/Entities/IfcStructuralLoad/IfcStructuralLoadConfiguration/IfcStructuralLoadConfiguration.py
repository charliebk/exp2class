from typing import List

class IfcStructuralLoadConfiguration(IfcStructuralLoad):
    def __init__(self):
        self.Values: List[IfcStructuralLoadOrResult] = None
        self.Locations: List[UNIQUE LIST [1:2] OF IfcLengthMeasure] = None

    # === WHERE CLAUSES ===
    # ValidListSize : NOT EXISTS(Locations) OR (SIZEOF(Locations) = SIZEOF(Values))
