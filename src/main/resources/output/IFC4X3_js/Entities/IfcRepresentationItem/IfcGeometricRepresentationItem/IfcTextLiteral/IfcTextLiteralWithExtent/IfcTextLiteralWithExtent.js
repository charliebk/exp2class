class IfcTextLiteralWithExtent extends IfcTextLiteral {
    constructor() {
        /** @type {IFCPLANAREXTENT} */
        this.Extent = null;
        /** @type {IFCBOXALIGNMENT} */
        this.BoxAlignment = null;
    }

    // === WHERE CLAUSES ===
    // WR31 : NOT('IFC4X3_DEV_73740fe4.IFCPLANARBOX' IN TYPEOF(Extent))
}
