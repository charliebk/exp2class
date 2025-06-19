public class IfcDirection extends IfcGeometricRepresentationItem {
    public List<IfcReal> DirectionRatios;

    // === WHERE CLAUSES ===
    // MagnitudeGreaterZero : SIZEOF(QUERY(Tmp <* DirectionRatios | Tmp <> 0.0)) > 0

    // === DERIVE CLAUSES ===
    // Dim : IfcDimensionCount := HIINDEX(DirectionRatios)
}
