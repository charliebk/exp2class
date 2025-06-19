class IfcRoundedRectangleProfileDef extends IfcRectangleProfileDef {
    constructor() {
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.RoundingRadius = null;
    }

    // === WHERE CLAUSES ===
    // ValidRadius : ((RoundingRadius <= (SELF\IfcRectangleProfileDef.XDim/2.)) AND (RoundingRadius <= (SELF\IfcRectangleProfileDef.YDim/2.)))
}
