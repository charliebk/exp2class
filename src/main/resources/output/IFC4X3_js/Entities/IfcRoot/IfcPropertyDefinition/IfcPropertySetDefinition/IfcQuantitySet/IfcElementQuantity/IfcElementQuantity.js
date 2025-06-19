class IfcElementQuantity extends IfcQuantitySet {
    constructor() {
        /** @type {IFCLABEL} */
        this.MethodOfMeasurement = null;
        /** @type {SET [1:?] OF IFCPHYSICALQUANTITY} */
        this.Quantities = null;
    }

    // === WHERE CLAUSES ===
    // UniqueQuantityNames : IfcUniqueQuantityNames(Quantities)
}
