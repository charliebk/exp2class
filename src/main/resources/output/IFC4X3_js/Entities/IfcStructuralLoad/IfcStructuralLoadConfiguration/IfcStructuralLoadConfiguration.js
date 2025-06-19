class IfcStructuralLoadConfiguration extends IfcStructuralLoad {
    constructor() {
        /** @type {IFCSTRUCTURALLOADORRESULT[]} */
        this.Values = null;
        /** @type {UNIQUE LIST [1:2] OF IFCLENGTHMEASURE[]} */
        this.Locations = null;
    }

    // === WHERE CLAUSES ===
    // ValidListSize : NOT EXISTS(Locations) OR (SIZEOF(Locations) = SIZEOF(Values))
}
