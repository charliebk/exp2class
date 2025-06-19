class IfcDoorPanelProperties extends IfcPreDefinedPropertySet {
    constructor() {
        /** @type {IFCPOSITIVELENGTHMEASURE} */
        this.PanelDepth = null;
        /** @type {IFCDOORPANELOPERATIONENUM} */
        this.PanelOperation = null;
        /** @type {IFCNORMALISEDRATIOMEASURE} */
        this.PanelWidth = null;
        /** @type {IFCDOORPANELPOSITIONENUM} */
        this.PanelPosition = null;
        /** @type {IFCSHAPEASPECT} */
        this.ShapeAspectStyle = null;
    }

    // === WHERE CLAUSES ===
    // ApplicableToType : (EXISTS(SELF\IfcPropertySetDefinition.DefinesType[1])) AND ('IFC4X3_DEV_73740fe4.IFCDOORTYPE' IN TYPEOF(SELF\IfcPropertySetDefinition.DefinesType[1]))
}
