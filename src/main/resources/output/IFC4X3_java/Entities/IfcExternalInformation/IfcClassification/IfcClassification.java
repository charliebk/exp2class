public class IfcClassification extends IfcExternalInformation {
    public IfcLabel Source;
    public IfcLabel Edition;
    public IfcDate EditionDate;
    public IfcLabel Name;
    public IfcText Description;
    public IfcURIReference Specification;
    public List<IfcIdentifier> ReferenceTokens;

    // === INVERSE CLAUSES ===
    // ClassificationForObjects : SET [0:?] OF IfcRelAssociatesClassification FOR RelatingClassification
    // HasReferences : SET [0:?] OF IfcClassificationReference FOR ReferencedSource
}
