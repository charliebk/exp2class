public class IfcTriangulatedFaceSet : IfcTessellatedFaceSet
{
    public List<List<IfcParameterValue>> Normals { get; set; }
    public IfcBoolean Closed { get; set; }
    public List<List<IfcPositiveInteger>> CoordIndex { get; set; }
    public List<IfcPositiveInteger> PnIndex { get; set; }

    // === EXTENDED BY ===
    // IfcTriangulatedIrregularNetwork

    // === DERIVE CLAUSES ===
    // NumberOfTriangles : IfcInteger := SIZEOF(CoordIndex)
}
