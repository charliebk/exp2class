class IfcStyledRepresentation extends IfcStyleModel {
    constructor() {
        // no parameters
    }

    // === WHERE CLAUSES ===
    // OnlyStyledItems : SIZEOF(QUERY(temp <* SELF\IfcRepresentation.Items | (NOT('IFC4X3_DEV_73740fe4.IFCSTYLEDITEM' IN TYPEOF(temp))) )) = 0
}
