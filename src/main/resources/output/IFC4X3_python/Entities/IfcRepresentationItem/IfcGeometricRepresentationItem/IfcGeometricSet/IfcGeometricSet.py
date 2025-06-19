class IfcGeometricSet(IfcGeometricRepresentationItem):
    def __init__(self):
        self.Elements: SET [1:?] OF IfcGeometricSetSelect = None

    # === EXTENDED BY ===
    # IfcGeometricCurveSet

    # === WHERE CLAUSES ===
    # ConsistentDim : SIZEOF(QUERY(Temp <* Elements | Temp.Dim <> Elements[1].Dim)) = 0

    # === DERIVE CLAUSES ===
    # Dim : IfcDimensionCount := Elements[1].Dim
