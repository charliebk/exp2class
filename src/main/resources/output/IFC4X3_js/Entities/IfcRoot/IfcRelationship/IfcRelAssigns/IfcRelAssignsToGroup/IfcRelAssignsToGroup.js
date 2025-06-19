class IfcRelAssignsToGroup extends IfcRelAssigns {
    constructor() {
        /** @type {IFCGROUP} */
        this.RelatingGroup = null;
    }

    // === EXTENDED BY ===
    // IfcRelAssignsToGroupByFactor

    // === WHERE CLAUSES ===
    // NoSelfReference : SIZEOF(QUERY(Temp <* SELF\IfcRelAssigns.RelatedObjects | RelatingGroup :=: Temp)) = 0
}
