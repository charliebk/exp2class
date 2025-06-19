class IfcTrapeziumProfileDef extends IfcParameterizedProfileDef {
    constructor() {
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.BottomXDim = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.TopXDim = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.YDim = null;
        /** @type {IFCLENGTHMEASURE} */
        this.TopXOffset = null;
    }
}
