class IfcAsymmetricIShapeProfileDef extends IfcParameterizedProfileDef {
    constructor() {
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.BottomFlangeWidth = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.OverallDepth = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.WebThickness = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.BottomFlangeThickness = null;
        /** @type {IFCNONNEGATIVELENGTHMEASURE} */
        this.BottomFlangeFilletRadius = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.TopFlangeWidth = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.TopFlangeThickness = null;
        /** @type {IFCNONNEGATIVELENGTHMEASURE} */
        this.TopFlangeFilletRadius = null;
        /** @type {IFCNONNEGATIVELENGTHMEASURE} */
        this.BottomFlangeEdgeRadius = null;
        /** @type {IFCPLANEANGLEMEASURE} */
        this.BottomFlangeSlope = null;
        /** @type {IFCNONNEGATIVELENGTHMEASURE} */
        this.TopFlangeEdgeRadius = null;
        /** @type {IFCPLANEANGLEMEASURE} */
        this.TopFlangeSlope = null;
    }

    // === WHERE CLAUSES ===
    // ValidBottomFilletRadius : (NOT(EXISTS(BottomFlangeFilletRadius))) OR (BottomFlangeFilletRadius <= (BottomFlangeWidth - WebThickness)/2.)
    // ValidFlangeThickness : NOT(EXISTS(TopFlangeThickness)) OR ((BottomFlangeThickness + TopFlangeThickness) < OverallDepth)
    // ValidTopFilletRadius : (NOT(EXISTS(TopFlangeFilletRadius))) OR (TopFlangeFilletRadius <= (TopFlangeWidth - WebThickness)/2.)
    // ValidWebThickness : (WebThickness < BottomFlangeWidth) AND (WebThickness < TopFlangeWidth)
}
