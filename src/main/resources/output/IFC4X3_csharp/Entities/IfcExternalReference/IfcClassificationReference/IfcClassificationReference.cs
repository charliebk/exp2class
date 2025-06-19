public class IfcClassificationReference : IfcExternalReference
{
    public IfcClassificationReferenceSelect ReferencedSource { get; set; }
    public IfcText Description { get; set; }
    public IfcIdentifier Sort { get; set; }

    // === INVERSE CLAUSES ===
    // ClassificationRefForObjects : SET [0:?] OF IfcRelAssociatesClassification FOR RelatingClassification
    // HasReferences : SET [0:?] OF IfcClassificationReference FOR ReferencedSource
}
