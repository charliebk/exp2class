from typing import List

class IfcSectionedSolid(IfcSolidModel):
    def __init__(self):
        self.Directrix: IfcCurve = None
        self.CrossSections: List[IfcProfileDef] = None

    # === EXTENDED BY ===
    # IfcSectionedSolidHorizontal

    # === WHERE CLAUSES ===
    # ConsistentProfileTypes : SIZEOF(QUERY(temp <* CrossSections | CrossSections[1].ProfileType <> temp.ProfileType)) = 0
    # DirectrixIs3D : Directrix.Dim = 3
    # SectionsSameType : SIZEOF(QUERY(temp <* CrossSections | TYPEOF(CrossSections[1]) :<>: TYPEOF(temp))) = 0
