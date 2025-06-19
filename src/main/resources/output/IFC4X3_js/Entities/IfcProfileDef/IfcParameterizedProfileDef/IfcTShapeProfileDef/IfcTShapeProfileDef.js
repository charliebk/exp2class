class IfcTShapeProfileDef extends IfcParameterizedProfileDef {
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
        this.FlangeEdgeRadius = null;
        /** @type {IFCNONNEGATIVELENGTHMEASURE} */
        this.WebEdgeRadius = null;
        /** @type {IFCPLANEANGLEMEASURE} */
        this.WebSlope = null;
        /** @type {IFCPLANEANGLEMEASURE} */
        this.FlangeSlope = null;
    }

    // === WHERE CLAUSES ===
    // ValidFlangeThickness : FlangeThickness < Depth
    // ValidWebThickness : WebThickness < FlangeWidth
}
