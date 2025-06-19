public class IfcHalfSpaceSolid : IfcGeometricRepresentationItem
{
    public IfcSurface BaseSurface { get; set; }
    public IfcBoolean AgreementFlag { get; set; }

    // === EXTENDED BY ===
    // IfcBoxedHalfSpace
    // IfcPolygonalBoundedHalfSpace

    // === DERIVE CLAUSES ===
    // Dim : IfcDimensionCount := 3
}
