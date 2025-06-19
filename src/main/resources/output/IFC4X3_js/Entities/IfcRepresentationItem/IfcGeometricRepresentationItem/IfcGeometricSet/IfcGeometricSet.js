class IfcGeometricSet extends IfcGeometricRepresentationItem {
    constructor() {
        /** @type {SET [1:?] OF IFCGEOMETRICSETSELECT} */
        this.Elements = null;
    }

    // === EXTENDED BY ===
    // IfcGeometricCurveSet

    // === WHERE CLAUSES ===
    // ConsistentDim : SIZEOF(QUERY(Temp <* Elements | Temp.Dim <> Elements[1].Dim)) = 0

    // === DERIVE CLAUSES ===
    // Dim : IfcDimensionCount := Elements[1].Dim
}
