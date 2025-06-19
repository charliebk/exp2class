public class IfcDocumentReference : IfcExternalReference
{
    public IfcText Description { get; set; }
    public IfcDocumentInformation ReferencedDocument { get; set; }

    // === INVERSE CLAUSES ===
    // DocumentRefForObjects : SET [0:?] OF IfcRelAssociatesDocument FOR RelatingDocument

    // === WHERE CLAUSES ===
    // WR1 : EXISTS(Name) XOR EXISTS(ReferencedDocument)
}
