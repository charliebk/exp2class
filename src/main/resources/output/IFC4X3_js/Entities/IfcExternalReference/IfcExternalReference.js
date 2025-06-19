class IfcExternalReference {
    constructor() {
        /** @type {IFCURIREFERENCE} */
        this.Location = null;
        /** @type {IFCIDENTIFIER} */
        this.Identification = null;
        /** @type {IFCLABEL} */
        this.Name = null;
    }

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
