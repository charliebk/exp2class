public class IfcTessellatedFaceSet : IfcTessellatedItem
{
    public IfcCartesianPointList3D Coordinates { get; set; }

    // === EXTENDED BY ===
    // IfcPolygonalFaceSet
    // IfcTriangulatedFaceSet

    // === INVERSE CLAUSES ===
    // HasColours : SET [0:1] OF IfcIndexedColourMap FOR MappedTo
    // HasTextures : SET [0:?] OF IfcIndexedTextureMap FOR MappedTo

    // === DERIVE CLAUSES ===
    // Dim : IfcDimensionCount := 3
}
