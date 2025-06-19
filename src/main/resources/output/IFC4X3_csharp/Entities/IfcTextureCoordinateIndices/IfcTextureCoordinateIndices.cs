public class IfcTextureCoordinateIndices
{
    public List<IfcPositiveInteger> TexCoordIndex { get; set; }
    public IfcIndexedPolygonalFace TexCoordsOf { get; set; }

    // === EXTENDED BY ===
    // IfcTextureCoordinateIndicesWithVoids

    // === INVERSE CLAUSES ===
    // ToTexMap : IfcIndexedPolygonalTextureMap FOR TexCoordIndices
}
