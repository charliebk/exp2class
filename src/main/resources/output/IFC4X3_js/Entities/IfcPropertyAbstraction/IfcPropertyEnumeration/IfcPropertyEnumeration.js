class IfcPropertyEnumeration extends IfcPropertyAbstraction {
    constructor() {
        /** @type {IFCLABEL} */
        this.Name = null;
        /** @type {UNIQUE IFCVALUE[]} */
        this.EnumerationValues = null;
        /** @type {IFCUNIT} */
        this.Unit = null;
    }

    // === WHERE CLAUSES ===
    // WR01 : SIZEOF(QUERY(temp <* SELF.EnumerationValues | NOT(TYPEOF(SELF.EnumerationValues[1]) = TYPEOF(temp)) )) = 0

    // === UNIQUE CLAUSES ===
    // UR1 : Name
}
