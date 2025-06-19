public class IfcResource : IfcObject
{
    public IfcIdentifier Identification { get; set; }
    public IfcText LongDescription { get; set; }

    // === EXTENDED BY ===
    // IfcConstructionResource

    // === INVERSE CLAUSES ===
    // ResourceOf : SET [0:?] OF IfcRelAssignsToResource FOR RelatingResource
}
