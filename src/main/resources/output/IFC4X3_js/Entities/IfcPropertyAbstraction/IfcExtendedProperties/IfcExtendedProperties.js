class IfcExtendedProperties extends IfcPropertyAbstraction {
    constructor() {
        /** @type {IFCIDENTIFIER} */
        this.Name = null;
        /** @type {IFCTEXT} */
        this.Description = null;
        /** @type {SET [1:?] OF IFCPROPERTY} */
        this.Properties = null;
    }

    // === EXTENDED BY ===
    // IfcMaterialProperties
    // IfcProfileProperties
}
