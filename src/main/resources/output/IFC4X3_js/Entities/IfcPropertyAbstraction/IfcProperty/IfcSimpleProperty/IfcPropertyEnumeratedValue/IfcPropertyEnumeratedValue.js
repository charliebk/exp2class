class IfcPropertyEnumeratedValue extends IfcSimpleProperty {
    constructor() {
        /** @type {IFCVALUE[]} */
        this.EnumerationValues = null;
        /** @type {IFCPROPERTYENUMERATION} */
        this.EnumerationReference = null;
    }

    // === WHERE CLAUSES ===
    // WR21 : NOT(EXISTS(EnumerationReference)) OR  NOT(EXISTS(EnumerationValues)) OR  (SIZEOF(QUERY(temp <* EnumerationValues | temp IN EnumerationReference.EnumerationValues)) = SIZEOF(EnumerationValues))
}
