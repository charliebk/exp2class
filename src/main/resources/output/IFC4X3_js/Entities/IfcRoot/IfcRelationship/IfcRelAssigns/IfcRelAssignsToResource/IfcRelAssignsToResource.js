class IfcRelAssignsToResource extends IfcRelAssigns {
    constructor() {
        /** @type {IFCRESOURCESELECT} */
        this.RelatingResource = null;
    }

    // === WHERE CLAUSES ===
    // NoSelfReference : SIZEOF(QUERY(Temp <* SELF\IfcRelAssigns.RelatedObjects | RelatingResource :=: Temp)) = 0
}
