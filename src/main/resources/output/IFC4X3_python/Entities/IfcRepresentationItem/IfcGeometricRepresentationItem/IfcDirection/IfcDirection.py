from typing import List

class IfcDirection(IfcGeometricRepresentationItem):
    def __init__(self):
        self.DirectionRatios: List[IfcReal] = None

    # === WHERE CLAUSES ===
    # MagnitudeGreaterZero : SIZEOF(QUERY(Tmp <* DirectionRatios | Tmp <> 0.0)) > 0

    # === DERIVE CLAUSES ===
    # Dim : IfcDimensionCount := HIINDEX(DirectionRatios)
