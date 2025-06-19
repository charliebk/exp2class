class IfcSweptSurface extends IfcSurface {
    constructor() {
        /** @type {IFCPROFILEDEF} */
        this.SweptCurve = null;
        /** @type {IFCAXIS2PLACEMENT3D} */
        this.Position = null;
    }

    // === EXTENDED BY ===
    // IfcSurfaceOfLinearExtrusion
    // IfcSurfaceOfRevolution

    // === WHERE CLAUSES ===
    // SweptCurveType : SweptCurve.ProfileType = IfcProfileTypeEnum.Curve
}
