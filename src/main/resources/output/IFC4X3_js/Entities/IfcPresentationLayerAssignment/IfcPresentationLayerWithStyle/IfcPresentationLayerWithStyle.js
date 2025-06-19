class IfcPresentationLayerWithStyle extends IfcPresentationLayerAssignment {
    constructor() {
        /** @type {IFCLOGICAL} */
        this.LayerOn = null;
        /** @type {IFCLOGICAL} */
        this.LayerFrozen = null;
        /** @type {IFCLOGICAL} */
        this.LayerBlocked = null;
        /** @type {SET [0:?] OF IFCPRESENTATIONSTYLE} */
        this.LayerStyles = null;
    }

    // === WHERE CLAUSES ===
    // ApplicableOnlyToItems : SIZEOF(QUERY(temp <* AssignedItems | (SIZEOF(TYPEOF(temp) * ['IFC4X3_DEV_73740fe4.IfcGeometricRepresentationItem','IFC4X3_DEV_73740fe4.IfcMappedItem']) >= 1))) = SIZEOF(AssignedItems)
}
