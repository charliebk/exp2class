public class IfcTriangulatedFaceSet extends IfcTessellatedFaceSet {
    public List<List<IfcParameterValue>> Normals;
    public IfcBoolean Closed;
    public List<List<IfcPositiveInteger>> CoordIndex;
    public List<IfcPositiveInteger> PnIndex;

    // === EXTENDED BY ===
    // IfcTriangulatedIrregularNetwork

    // === DERIVE CLAUSES ===
    // NumberOfTriangles : IfcInteger := SIZEOF(CoordIndex)
}
