public class IfcClassificationReference extends IfcExternalReference {
    public IfcClassificationReferenceSelect ReferencedSource;
    public IfcText Description;
    public IfcIdentifier Sort;

    // === INVERSE CLAUSES ===
    // ClassificationRefForObjects : SET [0:?] OF IfcRelAssociatesClassification FOR RelatingClassification
    // HasReferences : SET [0:?] OF IfcClassificationReference FOR ReferencedSource
}
