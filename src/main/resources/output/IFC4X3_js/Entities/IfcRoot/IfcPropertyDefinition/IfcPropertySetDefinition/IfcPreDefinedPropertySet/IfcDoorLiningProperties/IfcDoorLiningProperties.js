class IfcDoorLiningProperties extends IfcPreDefinedPropertySet {
    constructor() {
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.LiningDepth = null;
        /** @type {IFCNONNEGATIVELENGTHMEASURE} */
        this.LiningThickness = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.ThresholdDepth = null;
        /** @type {IFCNONNEGATIVELENGTHMEASURE} */
        this.ThresholdThickness = null;
        /** @type {IFCNONNEGATIVELENGTHMEASURE} */
        this.TransomThickness = null;
        /** @type {IFCLENGTHMEASURE} */
        this.TransomOffset = null;
        /** @type {IFCLENGTHMEASURE} */
        this.LiningOffset = null;
        /** @type {IFCLENGTHMEASURE} */
        this.ThresholdOffset = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.CasingThickness = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.CasingDepth = null;
        /** @type {IFCSHAPEASPECT} */
        this.ShapeAspectStyle = null;
        /** @type {IFCLENGTHMEASURE} */
        this.LiningToPanelOffsetX = null;
        /** @type {IFCLENGTHMEASURE} */
        this.LiningToPanelOffsetY = null;
    }

    // === WHERE CLAUSES ===
    // WR31 : NOT(EXISTS(LiningDepth) AND NOT(EXISTS(LiningThickness)))
    // WR32 : NOT(EXISTS(ThresholdDepth) AND NOT(EXISTS(ThresholdThickness)))
    // WR33 : (EXISTS(TransomOffset) AND EXISTS(TransomThickness)) XOR (NOT(EXISTS(TransomOffset)) AND NOT(EXISTS(TransomThickness)))
    // WR34 : (EXISTS(CasingDepth) AND EXISTS(CasingThickness)) XOR (NOT(EXISTS(CasingDepth)) AND NOT(EXISTS(CasingThickness)))
    // WR35 : (EXISTS(SELF\IfcPropertySetDefinition.DefinesType[1])) AND ('IFC4X3_DEV_73740fe4.IFCDOORTYPE' IN TYPEOF(SELF\IfcPropertySetDefinition.DefinesType[1]))
}
