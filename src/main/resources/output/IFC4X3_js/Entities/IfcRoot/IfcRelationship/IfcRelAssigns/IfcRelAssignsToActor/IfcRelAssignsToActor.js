class IfcRelAssignsToActor extends IfcRelAssigns {
    constructor() {
        /** @type {IFCACTOR} */
        this.RelatingActor = null;
        /** @type {IFCACTORROLE} */
        this.ActingRole = null;
    }

    // === WHERE CLAUSES ===
    // NoSelfReference : SIZEOF(QUERY(Temp <* SELF\IfcRelAssigns.RelatedObjects | RelatingActor :=: Temp)) = 0
}
