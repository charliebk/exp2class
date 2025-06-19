public class IfcIndexedTextureMap : IfcTextureCoordinate
{
    public IfcTessellatedFaceSet MappedTo { get; set; }
    public IfcTextureVertexList TexCoords { get; set; }

    // === EXTENDED BY ===
    // IfcIndexedPolygonalTextureMap
    // IfcIndexedTriangleTextureMap
}
