class IfcPropertySetTemplate extends IfcPropertyTemplateDefinition {
    constructor() {
        /** @type {IFCPROPERTYSETTEMPLATETYPEENUM} */
        this.TemplateType = null;
        /** @type {IFCIDENTIFIER} */
        this.ApplicableEntity = null;
        /** @type {SET [1:?] OF IFCPROPERTYTEMPLATE} */
        this.HasPropertyTemplates = null;
    }

    // === INVERSE CLAUSES ===
    // Defines : SET [0:?] OF IfcRelDefinesByTemplate FOR RelatingTemplate

    // === WHERE CLAUSES ===
    // ExistsName : EXISTS(SELF\IfcRoot.Name)
    // UniquePropertyNames : IfcUniquePropertyTemplateNames(HasPropertyTemplates)
}
