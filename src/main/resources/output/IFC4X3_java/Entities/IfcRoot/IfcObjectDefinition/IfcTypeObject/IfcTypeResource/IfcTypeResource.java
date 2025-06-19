public class IfcTypeResource extends IfcTypeObject {
    public IfcIdentifier Identification;
    public IfcText LongDescription;
    public IfcLabel ResourceType;

    // === EXTENDED BY ===
    // IfcConstructionResourceType

    // === INVERSE CLAUSES ===
    // ResourceOf : SET [0:?] OF IfcRelAssignsToResource FOR RelatingResource
}
