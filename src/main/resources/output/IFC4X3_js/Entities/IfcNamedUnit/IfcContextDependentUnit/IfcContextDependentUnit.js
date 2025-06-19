class IfcContextDependentUnit extends IfcNamedUnit {
    constructor() {
        /** @type {IFCLABEL} */
        this.Name = null;
    }

    // === INVERSE CLAUSES ===
    // HasExternalReference : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
}
