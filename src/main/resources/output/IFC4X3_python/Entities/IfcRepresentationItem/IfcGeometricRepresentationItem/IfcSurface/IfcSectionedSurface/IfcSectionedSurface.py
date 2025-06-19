from typing import List

class IfcSectionedSurface(IfcSurface):
    def __init__(self):
        self.Directrix: IfcCurve = None
        self.CrossSectionPositions: List[IfcAxis2PlacementLinear] = None
        self.CrossSections: List[IfcProfileDef] = None

    # === WHERE CLAUSES ===
    # AreaProfileTypes : SIZEOF(QUERY(temp <* CrossSections | temp.ProfileType = IfcProfileTypeEnum.CURVE)) <> 0
    # CorrespondingSectionPositions : SIZEOF(CrossSections) = SIZEOF(CrossSectionPositions)
    # DirectrixIs3D : Directrix.Dim = 3
    # NoOffsets : SIZEOF(QUERY(temp <* CrossSectionPositions | EXISTS(temp.Location.OffsetLateral) OR EXISTS(temp.Location.OffsetVertical) OR EXISTS(temp.Location.OffsetLongitudinal))) = 0
    # SectionsSameType : SIZEOF(QUERY(temp <* CrossSections | TYPEOF(CrossSections[1]) :<>: TYPEOF(temp))) = 0
