class IfcMapConversion extends IfcCoordinateOperation {
    constructor() {
        /** @type {IFCLENGTHMEASURE} */
        this.Eastings = null;
        /** @type {IFCLENGTHMEASURE} */
        this.Northings = null;
        /** @type {IFCLENGTHMEASURE} */
        this.OrthogonalHeight = null;
        /** @type {IFCREAL} */
        this.XAxisAbscissa = null;
        /** @type {IFCREAL} */
        this.XAxisOrdinate = null;
        /** @type {IFCREAL} */
        this.Scale = null;
    }

    // === EXTENDED BY ===
    // IfcMapConversionScaled

    // === WHERE CLAUSES ===
    // TargetCRSOnlyProjected : 'IFC4X3_DEV_73740fe4.IFCPROJECTEDCRS' IN TYPEOF(SELF\IfcCoordinateOperation.TargetCRS)
}
