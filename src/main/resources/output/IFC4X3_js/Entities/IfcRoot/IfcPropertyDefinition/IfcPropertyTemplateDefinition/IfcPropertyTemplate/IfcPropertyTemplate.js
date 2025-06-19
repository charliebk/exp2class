class IfcPropertyTemplate extends IfcPropertyTemplateDefinition {
    constructor() {
        // no parameters
    }

    // === EXTENDED BY ===
    // IfcComplexPropertyTemplate
    // IfcSimplePropertyTemplate

    // === INVERSE CLAUSES ===
    // PartOfComplexTemplate : SET [0:?] OF IfcComplexPropertyTemplate FOR HasPropertyTemplates
    // PartOfPsetTemplate : SET [0:?] OF IfcPropertySetTemplate FOR HasPropertyTemplates
}
