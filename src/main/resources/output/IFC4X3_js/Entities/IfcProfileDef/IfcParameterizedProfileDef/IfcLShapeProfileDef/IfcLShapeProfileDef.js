class IfcLShapeProfileDef extends IfcParameterizedProfileDef {
    constructor() {
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.Depth = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.Width = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.Thickness = null;
        /** @type {IFCNONNEGATIVELENGTHMEASURE} */
        this.FilletRadius = null;
        /** @type {IFCNONNEGATIVELENGTHMEASURE} */
        this.EdgeRadius = null;
        /** @type {IFCPLANEANGLEMEASURE} */
        this.LegSlope = null;
    }

    // === WHERE CLAUSES ===
    // ValidThickness : (Thickness < Depth) AND (NOT(EXISTS(Width)) OR (Thickness < Width))
}
