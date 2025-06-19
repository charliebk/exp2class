class IfcRectangleHollowProfileDef extends IfcRectangleProfileDef {
    constructor() {
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.WallThickness = null;
        /** @type {IFCNONNEGATIVELENGTHMEASURE} */
        this.InnerFilletRadius = null;
        /** @type {IFCNONNEGATIVELENGTHMEASURE} */
        this.OuterFilletRadius = null;
    }

    // === WHERE CLAUSES ===
    // ValidInnerRadius : NOT(EXISTS(InnerFilletRadius)) OR ((InnerFilletRadius <= (SELF\IfcRectangleProfileDef.XDim/2. - WallThickness)) AND (InnerFilletRadius <= (SELF\IfcRectangleProfileDef.YDim/2. - WallThickness)))
    // ValidOuterRadius : NOT(EXISTS(OuterFilletRadius)) OR ((OuterFilletRadius <= (SELF\IfcRectangleProfileDef.XDim/2.)) AND (OuterFilletRadius <= (SELF\IfcRectangleProfileDef.YDim/2.)))
    // ValidWallThickness : (WallThickness < (SELF\IfcRectangleProfileDef.XDim/2.)) AND (WallThickness < (SELF\IfcRectangleProfileDef.YDim/2.))
}
