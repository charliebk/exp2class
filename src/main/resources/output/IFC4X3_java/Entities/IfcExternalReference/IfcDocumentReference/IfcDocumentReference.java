public class IfcDocumentReference extends IfcExternalReference {
    public IfcText Description;
    public IfcDocumentInformation ReferencedDocument;

    // === INVERSE CLAUSES ===
    // DocumentRefForObjects : SET [0:?] OF IfcRelAssociatesDocument FOR RelatingDocument

    // === WHERE CLAUSES ===
    // WR1 : EXISTS(Name) XOR EXISTS(ReferencedDocument)
}
