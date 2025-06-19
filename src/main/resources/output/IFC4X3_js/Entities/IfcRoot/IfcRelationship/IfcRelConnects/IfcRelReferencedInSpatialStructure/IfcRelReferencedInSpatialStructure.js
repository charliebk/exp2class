class IfcRelReferencedInSpatialStructure extends IfcRelConnects {
    constructor() {
        /** @type {SET [1:?] OF IFCSPATIALREFERENCESELECT} */
        this.RelatedElements = null;
        /** @type {IFCSPATIALELEMENT} */
        this.RelatingStructure = null;
    }

    // === WHERE CLAUSES ===
    // AllowedRelatedElements : SIZEOF(QUERY(temp <* RelatedElements | ('IFC4X3_DEV_73740fe4.IFCSPATIALSTRUCTUREELEMENT' IN TYPEOF(temp)) AND (NOT ('IFC4X3_DEV_73740fe4.IFCSPACE' IN TYPEOF(temp))) )) = 0
}
