public class IfcGeometricSet extends IfcGeometricRepresentationItem {
    public SET [1:?] OF IfcGeometricSetSelect Elements;

    // === EXTENDED BY ===
    // IfcGeometricCurveSet

    // === WHERE CLAUSES ===
    // ConsistentDim : SIZEOF(QUERY(Temp <* Elements | Temp.Dim <> Elements[1].Dim)) = 0

    // === DERIVE CLAUSES ===
    // Dim : IfcDimensionCount := Elements[1].Dim
}
