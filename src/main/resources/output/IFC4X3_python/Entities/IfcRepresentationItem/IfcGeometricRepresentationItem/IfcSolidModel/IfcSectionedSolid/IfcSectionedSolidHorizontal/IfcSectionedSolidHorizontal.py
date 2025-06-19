from typing import List

class IfcSectionedSolidHorizontal(IfcSectionedSolid):
    def __init__(self):
        self.CrossSectionPositions: List[IfcAxis2PlacementLinear] = None

    # === WHERE CLAUSES ===
    # CorrespondingSectionPositions : SIZEOF(CrossSections) = SIZEOF(CrossSectionPositions)
    # NoLongitudinalOffsets : SIZEOF(QUERY(temp <* CrossSectionPositions | EXISTS(temp.Location.OffsetLongitudinal))) = 0
