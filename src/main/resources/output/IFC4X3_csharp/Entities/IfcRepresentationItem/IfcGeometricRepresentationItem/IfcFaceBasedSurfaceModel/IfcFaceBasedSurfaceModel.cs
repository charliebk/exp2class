public class IfcFaceBasedSurfaceModel : IfcGeometricRepresentationItem
{
    public SET [1:?] OF IfcConnectedFaceSet FbsmFaces { get; set; }

    // === DERIVE CLAUSES ===
    // Dim : IfcDimensionCount := 3
}
