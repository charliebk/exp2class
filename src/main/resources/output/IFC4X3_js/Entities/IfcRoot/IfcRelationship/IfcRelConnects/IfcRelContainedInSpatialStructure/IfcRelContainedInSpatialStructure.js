class IfcRelContainedInSpatialStructure extends IfcRelConnects {
    constructor() {
        /** @type {SET [1:?] OF IFCPRODUCT} */
        this.RelatedElements = null;
        /** @type {IFCSPATIALELEMENT} */
        this.RelatingStructure = null;
    }

    // === WHERE CLAUSES ===
    // WR31 : SIZEOF(QUERY(temp <* RelatedElements | 'IFC4X3_DEV_73740fe4.IFCSPATIALSTRUCTUREELEMENT' IN TYPEOF(temp))) = 0
}
