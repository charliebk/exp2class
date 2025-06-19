class IfcPresentationLayerAssignment {
    constructor() {
        /** @type {IFCLABEL} */
        this.Name = null;
        /** @type {IFCTEXT} */
        this.Description = null;
        /** @type {SET [1:?] OF IFCLAYEREDITEM} */
        this.AssignedItems = null;
        /** @type {IFCIDENTIFIER} */
        this.Identifier = null;
    }

    // === EXTENDED BY ===
    // IfcPresentationLayerWithStyle

    // === WHERE CLAUSES ===
    // ApplicableItems : SIZEOF(QUERY(temp <* AssignedItems | ( SIZEOF(TYPEOF(temp) * [ 'IFC4X3_DEV_73740fe4.IFCSHAPEREPRESENTATION', 'IFC4X3_DEV_73740fe4.IFCGEOMETRICREPRESENTATIONITEM', 'IFC4X3_DEV_73740fe4.IFCMAPPEDITEM']) = 1) )) = SIZEOF(AssignedItems)
}
