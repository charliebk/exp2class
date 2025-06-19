class IfcFillAreaStyleHatching extends IfcGeometricRepresentationItem {
    constructor() {
        /** @type {IFCCURVESTYLE} */
        this.HatchLineAppearance = null;
        /** @type {IFCHATCHLINEDISTANCESELECT} */
        this.StartOfNextHatchLine = null;
        /** @type {IFCCARTESIANPOINT} */
        this.PointOfReferenceHatchLine = null;
        /** @type {IFCCARTESIANPOINT} */
        this.PatternStart = null;
        /** @type {IFCPLANEANGLEMEASURE} */
        this.HatchLineAngle = null;
    }

    // === WHERE CLAUSES ===
    // PatternStart2D : NOT(EXISTS(PatternStart)) OR (PatternStart.Dim = 2)
    // RefHatchLine2D : NOT(EXISTS(PointOfReferenceHatchLine)) OR (PointOfReferenceHatchLine.Dim = 2)
}
