class IfcRelAggregates extends IfcRelDecomposes {
    constructor() {
        /** @type {IFCOBJECTDEFINITION} */
        this.RelatingObject = null;
        /** @type {SET [1:?] OF IFCOBJECTDEFINITION} */
        this.RelatedObjects = null;
    }

    // === WHERE CLAUSES ===
    // NoSelfReference : SIZEOF(QUERY(Temp <* RelatedObjects | RelatingObject :=: Temp)) = 0
}
