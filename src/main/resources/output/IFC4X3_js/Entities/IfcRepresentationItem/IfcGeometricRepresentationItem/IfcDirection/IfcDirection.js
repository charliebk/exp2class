class IfcDirection extends IfcGeometricRepresentationItem {
    constructor() {
        /** @type {IFCREAL[]} */
        this.DirectionRatios = null;
    }

    // === WHERE CLAUSES ===
    // MagnitudeGreaterZero : SIZEOF(QUERY(Tmp <* DirectionRatios | Tmp <> 0.0)) > 0

    // === DERIVE CLAUSES ===
    // Dim : IfcDimensionCount := HIINDEX(DirectionRatios)
}
