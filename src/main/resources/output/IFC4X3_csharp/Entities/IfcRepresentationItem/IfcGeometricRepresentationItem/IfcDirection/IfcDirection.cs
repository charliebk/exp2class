public class IfcDirection : IfcGeometricRepresentationItem
{
    public List<IfcReal> DirectionRatios { get; set; }

    // === WHERE CLAUSES ===
    // MagnitudeGreaterZero : SIZEOF(QUERY(Tmp <* DirectionRatios | Tmp <> 0.0)) > 0

    // === DERIVE CLAUSES ===
    // Dim : IfcDimensionCount := HIINDEX(DirectionRatios)
}
