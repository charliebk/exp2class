class IfcRelAssignsToProcess extends IfcRelAssigns {
    constructor() {
        /** @type {IFCPROCESSSELECT} */
        this.RelatingProcess = null;
        /** @type {IFCMEASUREWITHUNIT} */
        this.QuantityInProcess = null;
    }

    // === WHERE CLAUSES ===
    // NoSelfReference : SIZEOF(QUERY(Temp <* SELF\IfcRelAssigns.RelatedObjects | RelatingProcess :=: Temp)) = 0
}
