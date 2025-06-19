class IfcZShapeProfileDef extends IfcParameterizedProfileDef {
    constructor() {
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.Depth = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.FlangeWidth = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.WebThickness = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.FlangeThickness = null;
        /** @type {IFCNONNEGATIVELENGTHMEASURE} */
        this.FilletRadius = null;
        /** @type {IFCNONNEGATIVELENGTHMEASURE} */
        this.EdgeRadius = null;
    }

    // === WHERE CLAUSES ===
    // ValidFlangeThickness : FlangeThickness < (Depth / 2.)
}
