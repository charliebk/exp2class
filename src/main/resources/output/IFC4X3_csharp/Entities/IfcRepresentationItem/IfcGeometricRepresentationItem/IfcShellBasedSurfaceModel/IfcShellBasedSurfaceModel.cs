public class IfcShellBasedSurfaceModel : IfcGeometricRepresentationItem
{
    public SET [1:?] OF IfcShell SbsmBoundary { get; set; }

    // === DERIVE CLAUSES ===
    // Dim : IfcDimensionCount := 3
}
