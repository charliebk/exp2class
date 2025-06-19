from typing import List

class IfcSectionedSpine(IfcGeometricRepresentationItem):
    def __init__(self):
        self.SpineCurve: IfcCompositeCurve = None
        self.CrossSections: List[IfcProfileDef] = None
        self.CrossSectionPositions: List[IfcAxis2Placement3D] = None

    # === WHERE CLAUSES ===
    # ConsistentProfileTypes : SIZEOF(QUERY(temp <* CrossSections | CrossSections[1].ProfileType <> temp.ProfileType)) = 0
    # CorrespondingSectionPositions : SIZEOF(CrossSections) = SIZEOF(CrossSectionPositions)
    # SpineCurveDim : SpineCurve.Dim = 3

    # === DERIVE CLAUSES ===
    # Dim : IfcDimensionCount := 3
