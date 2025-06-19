public class IfcTriangulatedIrregularNetwork : IfcTriangulatedFaceSet
{
    public List<IfcInteger> Flags { get; set; }

    // === WHERE CLAUSES ===
    // NotClosed : SELF\IfcTriangulatedFaceSet.Closed = FALSE
}
