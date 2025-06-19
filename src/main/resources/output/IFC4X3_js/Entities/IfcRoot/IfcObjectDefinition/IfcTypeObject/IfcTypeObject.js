class IfcTypeObject extends IfcObjectDefinition {
    constructor() {
        /** @type {IFCIDENTIFIER} */
        this.ApplicableOccurrence = null;
        /** @type {SET [1:?] OF IFCPROPERTYSETDEFINITION} */
        this.HasPropertySets = null;
    }

    // === EXTENDED BY ===
    // IfcTypeProcess
    // IfcTypeProduct
    // IfcTypeResource

    // === INVERSE CLAUSES ===
    // Types : SET [0:1] OF IfcRelDefinesByType FOR RelatingType

    // === WHERE CLAUSES ===
    // NameRequired : EXISTS(SELF\IfcRoot.Name)
    // UniquePropertySetNames : (NOT(EXISTS(HasPropertySets))) OR IfcUniquePropertySetNames(HasPropertySets)
}
