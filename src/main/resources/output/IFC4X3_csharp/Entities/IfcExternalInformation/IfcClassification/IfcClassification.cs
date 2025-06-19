public class IfcClassification : IfcExternalInformation
{
    public IfcLabel Source { get; set; }
    public IfcLabel Edition { get; set; }
    public IfcDate EditionDate { get; set; }
    public IfcLabel Name { get; set; }
    public IfcText Description { get; set; }
    public IfcURIReference Specification { get; set; }
    public List<IfcIdentifier> ReferenceTokens { get; set; }

    // === INVERSE CLAUSES ===
    // ClassificationForObjects : SET [0:?] OF IfcRelAssociatesClassification FOR RelatingClassification
    // HasReferences : SET [0:?] OF IfcClassificationReference FOR ReferencedSource
}
