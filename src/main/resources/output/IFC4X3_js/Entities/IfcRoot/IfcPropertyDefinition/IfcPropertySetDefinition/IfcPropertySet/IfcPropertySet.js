class IfcPropertySet extends IfcPropertySetDefinition {
    constructor() {
        /** @type {SET [1:?] OF IFCPROPERTY} */
        this.HasProperties = null;
    }

    // === WHERE CLAUSES ===
    // ExistsName : EXISTS(SELF\IfcRoot.Name)
    // UniquePropertyNames : IfcUniquePropertyName(HasProperties)
}
