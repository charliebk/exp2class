class IfcGeometricRepresentationContext extends IfcRepresentationContext {
    constructor() {
        /** @type {IFCDIMENSIONCOUNT} */
        this.CoordinateSpaceDimension = null;
        /** @type {IFCREAL} */
        this.Precision = null;
        /** @type {IFCAXIS2PLACEMENT} */
        this.WorldCoordinateSystem = null;
        /** @type {IFCDIRECTION} */
        this.TrueNorth = null;
    }

    // === EXTENDED BY ===
    // IfcGeometricRepresentationSubContext

    // === INVERSE CLAUSES ===
    // HasSubContexts : SET [0:?] OF IfcGeometricRepresentationSubContext FOR ParentContext
    // HasCoordinateOperation : SET [0:1] OF IfcCoordinateOperation FOR SourceCRS

    // === WHERE CLAUSES ===
    // North2D : NOT(EXISTS(TrueNorth)) OR (HIINDEX(TrueNorth.DirectionRatios) = 2)
}
