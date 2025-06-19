class IfcSurfaceOfRevolution extends IfcSweptSurface {
    constructor() {
        /** @type {IFCAXIS1PLACEMENT} */
        this.AxisPosition = null;
    }

    // === DERIVE CLAUSES ===
    // AxisLine : IfcLine := IfcRepresentationItem() || IfcGeometricRepresentationItem () || IfcCurve() || IfcLine(AxisPosition.Location, IfcRepresentationItem() || IfcGeometricRepresentationItem () || IfcVector(AxisPosition.Z,1.0))
}
