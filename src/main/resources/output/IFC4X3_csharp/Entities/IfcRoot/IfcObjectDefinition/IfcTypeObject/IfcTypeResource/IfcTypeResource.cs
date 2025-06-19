public class IfcTypeResource : IfcTypeObject
{
    public IfcIdentifier Identification { get; set; }
    public IfcText LongDescription { get; set; }
    public IfcLabel ResourceType { get; set; }

    // === EXTENDED BY ===
    // IfcConstructionResourceType

    // === INVERSE CLAUSES ===
    // ResourceOf : SET [0:?] OF IfcRelAssignsToResource FOR RelatingResource
}
