class IfcRelAssignsToControl extends IfcRelAssigns {
    constructor() {
        /** @type {IFCCONTROL} */
        this.RelatingControl = null;
    }

    // === WHERE CLAUSES ===
    // NoSelfReference : SIZEOF(QUERY(Temp <* SELF\IfcRelAssigns.RelatedObjects | RelatingControl :=: Temp)) = 0
}
