public class IfcExternalReference
{
    public IfcURIReference Location { get; set; }
    public IfcIdentifier Identification { get; set; }
    public IfcLabel Name { get; set; }

    // === EXTENDED BY ===
    // IfcClassificationReference
    // IfcDocumentReference
    // IfcExternallyDefinedHatchStyle
    // IfcExternallyDefinedSurfaceStyle
    // IfcExternallyDefinedTextFont
    // IfcLibraryReference

    // === INVERSE CLAUSES ===
    // ExternalReferenceForResources : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatingReference

    // === WHERE CLAUSES ===
    // WR1 : EXISTS(Identification) OR EXISTS(Location) OR EXISTS(Name)
}
