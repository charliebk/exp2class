class IfcCShapeProfileDef extends IfcParameterizedProfileDef {
    constructor() {
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.Depth = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.Width = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.WallThickness = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.Girth = null;
        /** @type {IFCNONNEGATIVELENGTHMEASURE} */
        this.InternalFilletRadius = null;
    }

    // === WHERE CLAUSES ===
    // ValidGirth : Girth < (Depth / 2.)
    // ValidInternalFilletRadius : NOT(EXISTS(InternalFilletRadius)) OR ((InternalFilletRadius <= Width/2. - WallThickness) AND (InternalFilletRadius <= Depth/2. - WallThickness))
    // ValidWallThickness : (WallThickness < Width/2.) AND (WallThickness < Depth/2.)
}
