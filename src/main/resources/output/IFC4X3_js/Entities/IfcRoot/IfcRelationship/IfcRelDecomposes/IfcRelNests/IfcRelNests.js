class IfcRelNests extends IfcRelDecomposes {
    constructor() {
        /** @type {IFCOBJECTDEFINITION} */
        this.RelatingObject = null;
        /** @type {IFCOBJECTDEFINITION[]} */
        this.RelatedObjects = null;
    }

    // === WHERE CLAUSES ===
    // NoSelfReference : SIZEOF(QUERY(Temp <* RelatedObjects | RelatingObject :=: Temp)) = 0
}
