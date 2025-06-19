class IfcIShapeProfileDef extends IfcParameterizedProfileDef {
    constructor() {
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.OverallWidth = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.OverallDepth = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.WebThickness = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.FlangeThickness = null;
        /** @type {IFCNONNEGATIVELENGTHMEASURE} */
        this.FilletRadius = null;
        /** @type {IFCNONNEGATIVELENGTHMEASURE} */
        this.FlangeEdgeRadius = null;
        /** @type {IFCPLANEANGLEMEASURE} */
        this.FlangeSlope = null;
    }

    // === WHERE CLAUSES ===
    // ValidFilletRadius : NOT(EXISTS(FilletRadius)) OR ((FilletRadius <= (OverallWidth - WebThickness)/2.) AND (FilletRadius <= (OverallDepth - (2. * FlangeThickness))/2.))
    // ValidFlangeThickness : (2. * FlangeThickness) < OverallDepth
    // ValidWebThickness : WebThickness < OverallWidth
}
