public class IfcIndexedPolygonalFace : IfcTessellatedItem
{
    public List<IfcPositiveInteger> CoordIndex { get; set; }

    // === EXTENDED BY ===
    // IfcIndexedPolygonalFaceWithVoids

    // === INVERSE CLAUSES ===
    // ToFaceSet : SET [1:?] OF IfcPolygonalFaceSet FOR Faces
    // HasTexCoords : SET [0:1] OF IfcTextureCoordinateIndices FOR TexCoordsOf
}
