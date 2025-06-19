class IfcRelAssignsToProduct extends IfcRelAssigns {
    constructor() {
        /** @type {IFCPRODUCTSELECT} */
        this.RelatingProduct = null;
    }

    // === WHERE CLAUSES ===
    // NoSelfReference : SIZEOF(QUERY(Temp <* SELF\IfcRelAssigns.RelatedObjects | RelatingProduct :=: Temp)) = 0
}
