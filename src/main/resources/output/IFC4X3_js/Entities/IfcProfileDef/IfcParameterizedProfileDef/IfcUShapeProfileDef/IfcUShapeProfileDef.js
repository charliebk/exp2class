class IfcUShapeProfileDef extends IfcParameterizedProfileDef {
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
        /** @type {IFCPLANEANGLEMEASURE} */
        this.FlangeSlope = null;
    }

    // === WHERE CLAUSES ===
    // ValidFlangeThickness : FlangeThickness < (Depth / 2.)
    // ValidWebThickness : WebThickness < FlangeWidth
}
