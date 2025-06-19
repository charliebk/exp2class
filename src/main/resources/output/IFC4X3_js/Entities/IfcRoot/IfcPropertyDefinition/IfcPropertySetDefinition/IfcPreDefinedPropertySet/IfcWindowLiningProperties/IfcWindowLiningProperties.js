class IfcWindowLiningProperties extends IfcPreDefinedPropertySet {
    constructor() {
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.LiningDepth = null;
        /** @type {IFCNONNEGATIVELENGTHMEASURE} */
        this.LiningThickness = null;
        /** @type {IFCNONNEGATIVELENGTHMEASURE} */
        this.TransomThickness = null;
        /** @type {IFCNONNEGATIVELENGTHMEASURE} */
        this.MullionThickness = null;
        /** @type {IFCNORMALISEDRATIOMEASURE} */
        this.FirstTransomOffset = null;
        /** @type {IFCNORMALISEDRATIOMEASURE} */
        this.SecondTransomOffset = null;
        /** @type {IFCNORMALISEDRATIOMEASURE} */
        this.FirstMullionOffset = null;
        /** @type {IFCNORMALISEDRATIOMEASURE} */
        this.SecondMullionOffset = null;
        /** @type {IFCSHAPEASPECT} */
        this.ShapeAspectStyle = null;
        /** @type {IFCLENGTHMEASURE} */
        this.LiningOffset = null;
        /** @type {IFCLENGTHMEASURE} */
        this.LiningToPanelOffsetX = null;
        /** @type {IFCLENGTHMEASURE} */
        this.LiningToPanelOffsetY = null;
    }

    // === WHERE CLAUSES ===
    // WR31 : NOT(EXISTS(LiningDepth) AND NOT(EXISTS(LiningThickness)))
    // WR32 : NOT(NOT(EXISTS(FirstTransomOffset)) AND EXISTS(SecondTransomOffset))
    // WR33 : NOT(NOT(EXISTS(FirstMullionOffset)) AND EXISTS(SecondMullionOffset))
    // WR34 : (EXISTS(SELF\IfcPropertySetDefinition.DefinesType[1])) AND ('IFC4X3_DEV_73740fe4.IFCWINDOWTYPE' IN TYPEOF(SELF\IfcPropertySetDefinition.DefinesType[1]))
}
