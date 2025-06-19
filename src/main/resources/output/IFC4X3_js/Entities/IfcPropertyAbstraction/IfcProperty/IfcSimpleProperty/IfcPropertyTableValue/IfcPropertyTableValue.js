class IfcPropertyTableValue extends IfcSimpleProperty {
    constructor() {
        /** @type {UNIQUE IFCVALUE[]} */
        this.DefiningValues = null;
        /** @type {IFCVALUE[]} */
        this.DefinedValues = null;
        /** @type {IFCTEXT} */
        this.Expression = null;
        /** @type {IFCUNIT} */
        this.DefiningUnit = null;
        /** @type {IFCUNIT} */
        this.DefinedUnit = null;
        /** @type {IFCCURVEINTERPOLATIONENUM} */
        this.CurveInterpolation = null;
    }

    // === WHERE CLAUSES ===
    // WR21 : (NOT(EXISTS(DefiningValues)) AND NOT(EXISTS(DefinedValues))) OR (SIZEOF(DefiningValues) = SIZEOF(DefinedValues))
    // WR22 : NOT(EXISTS(DefiningValues)) OR (SIZEOF(QUERY(temp <* SELF.DefiningValues | TYPEOF(temp) <> TYPEOF(SELF.DefiningValues[1]) )) = 0)
    // WR23 : NOT(EXISTS(DefinedValues)) OR (SIZEOF(QUERY(temp <* SELF.DefinedValues | TYPEOF(temp) <> TYPEOF(SELF.DefinedValues[1]) )) = 0)
}
