class IfcQuantityCount extends IfcPhysicalSimpleQuantity {
    constructor() {
        /** @type {IFCCOUNTMEASURE} */
        this.CountValue = null;
        /** @type {IFCLABEL} */
        this.Formula = null;
    }

    // === WHERE CLAUSES ===
    // WR21 : CountValue >= 0
}
