public class IfcResource extends IfcObject {
    public IfcIdentifier Identification;
    public IfcText LongDescription;

    // === EXTENDED BY ===
    // IfcConstructionResource

    // === INVERSE CLAUSES ===
    // ResourceOf : SET [0:?] OF IfcRelAssignsToResource FOR RelatingResource
}
