class IfcZone extends IfcSystem {
    constructor() {
        /** @type {IFCLABEL} */
        this.LongName = null;
    }

    // === WHERE CLAUSES ===
    // WR1 : (SIZEOF(SELF\IfcGroup.IsGroupedBy) = 0) OR (SIZEOF (QUERY (temp <* SELF\IfcGroup.IsGroupedBy[1].RelatedObjects | NOT(('IFC4X3_DEV_73740fe4.IFCZONE' IN TYPEOF(temp)) OR ('IFC4X3_DEV_73740fe4.IFCSPACE' IN TYPEOF(temp)) OR ('IFC4X3_DEV_73740fe4.IFCSPATIALZONE' IN TYPEOF(temp)) ))) = 0)
}
