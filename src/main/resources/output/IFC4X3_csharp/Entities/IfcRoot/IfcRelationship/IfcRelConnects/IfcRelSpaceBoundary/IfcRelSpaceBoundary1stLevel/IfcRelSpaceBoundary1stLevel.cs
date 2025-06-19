public class IfcRelSpaceBoundary1stLevel : IfcRelSpaceBoundary
{
    public IfcRelSpaceBoundary1stLevel ParentBoundary { get; set; }

    // === EXTENDED BY ===
    // IfcRelSpaceBoundary2ndLevel

    // === INVERSE CLAUSES ===
    // InnerBoundaries : SET [0:?] OF IfcRelSpaceBoundary1stLevel FOR ParentBoundary
}
