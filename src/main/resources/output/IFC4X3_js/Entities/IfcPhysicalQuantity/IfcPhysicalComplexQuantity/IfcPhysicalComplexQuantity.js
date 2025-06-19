class IfcPhysicalComplexQuantity extends IfcPhysicalQuantity {
    constructor() {
        /** @type {SET [1:?] OF IFCPHYSICALQUANTITY} */
        this.HasQuantities = null;
        /** @type {IFCLABEL} */
        this.Discrimination = null;
        /** @type {IFCLABEL} */
        this.Quality = null;
        /** @type {IFCLABEL} */
        this.Usage = null;
    }

    // === WHERE CLAUSES ===
    // NoSelfReference : SIZEOF(QUERY(temp <* HasQuantities | SELF :=: temp)) = 0
    // UniqueQuantityNames : IfcUniqueQuantityNames(HasQuantities)
}
