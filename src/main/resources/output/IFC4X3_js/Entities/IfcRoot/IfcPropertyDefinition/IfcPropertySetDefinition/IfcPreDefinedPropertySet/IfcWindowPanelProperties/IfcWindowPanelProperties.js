class IfcWindowPanelProperties extends IfcPreDefinedPropertySet {
    constructor() {
        /** @type {IFCWINDOWPANELOPERATIONENUM} */
        this.OperationType = null;
        /** @type {IFCWINDOWPANELPOSITIONENUM} */
        this.PanelPosition = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.FrameDepth = null;
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.FrameThickness = null;
        /** @type {IFCSHAPEASPECT} */
        this.ShapeAspectStyle = null;
    }

    // === WHERE CLAUSES ===
    // ApplicableToType : (EXISTS(SELF\IfcPropertySetDefinition.DefinesType[1])) AND ('IFC4X3_DEV_73740fe4.IFCWINDOWTYPE' IN TYPEOF(SELF\IfcPropertySetDefinition.DefinesType[1]))
}
