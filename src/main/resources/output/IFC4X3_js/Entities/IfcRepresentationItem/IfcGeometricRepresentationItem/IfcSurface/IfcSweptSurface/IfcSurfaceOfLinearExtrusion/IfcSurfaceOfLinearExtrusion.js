class IfcSurfaceOfLinearExtrusion extends IfcSweptSurface {
    constructor() {
        /** @type {IFCDIRECTION} */
        this.ExtrudedDirection = null;
        /** @type {IFCLENGTHMEASURE} */
        this.Depth = null;
    }

    // === WHERE CLAUSES ===
    // DepthGreaterZero : Depth > 0.

    // === DERIVE CLAUSES ===
    // ExtrusionAxis : IfcVector := IfcRepresentationItem() || IfcGeometricRepresentationItem () || IfcVector (ExtrudedDirection, Depth)
}
