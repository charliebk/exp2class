public class IfcRelSpaceBoundary2ndLevel : IfcRelSpaceBoundary1stLevel
{
    public IfcRelSpaceBoundary2ndLevel CorrespondingBoundary { get; set; }

    // === INVERSE CLAUSES ===
    // Corresponds : SET [0:1] OF IfcRelSpaceBoundary2ndLevel FOR CorrespondingBoundary
}
