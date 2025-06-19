class IfcPropertyListValue extends IfcSimpleProperty {
    constructor() {
        /** @type {IFCVALUE[]} */
        this.ListValues = null;
        /** @type {IFCUNIT} */
        this.Unit = null;
    }

    // === WHERE CLAUSES ===
    // WR31 : SIZEOF(QUERY(temp <* SELF.ListValues | NOT(TYPEOF(SELF.ListValues[1]) = TYPEOF(temp)) )) = 0
}
