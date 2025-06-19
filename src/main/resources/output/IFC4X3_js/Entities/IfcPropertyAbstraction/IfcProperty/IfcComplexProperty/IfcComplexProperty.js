class IfcComplexProperty extends IfcProperty {
    constructor() {
        /** @type {IFCIDENTIFIER} */
        this.UsageName = null;
        /** @type {SET [1:?] OF IFCPROPERTY} */
        this.HasProperties = null;
    }

    // === WHERE CLAUSES ===
    // WR21 : SIZEOF(QUERY(temp <* HasProperties | SELF :=: temp)) = 0
    // WR22 : IfcUniquePropertyName(HasProperties)
}
