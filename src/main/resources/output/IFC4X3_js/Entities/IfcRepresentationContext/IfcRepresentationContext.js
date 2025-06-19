class IfcRepresentationContext {
    constructor() {
        /** @type {IFCLABEL} */
        this.ContextIdentifier = null;
        /** @type {IFCLABEL} */
        this.ContextType = null;
    }

    // === EXTENDED BY ===
    // IfcGeometricRepresentationContext

    // === INVERSE CLAUSES ===
    // RepresentationsInContext : SET [0:?] OF IfcRepresentation FOR ContextOfItems
}
