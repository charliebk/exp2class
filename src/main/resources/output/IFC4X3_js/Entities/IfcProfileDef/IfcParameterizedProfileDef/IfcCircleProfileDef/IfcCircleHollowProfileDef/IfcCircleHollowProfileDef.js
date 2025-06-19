class IfcCircleHollowProfileDef extends IfcCircleProfileDef {
    constructor() {
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.WallThickness = null;
    }

    // === WHERE CLAUSES ===
    // WR1 : WallThickness < SELF\IfcCircleProfileDef.Radius
}
