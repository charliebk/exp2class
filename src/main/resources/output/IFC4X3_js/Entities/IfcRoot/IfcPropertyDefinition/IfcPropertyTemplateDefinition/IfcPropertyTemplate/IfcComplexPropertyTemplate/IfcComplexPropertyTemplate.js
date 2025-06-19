class IfcComplexPropertyTemplate extends IfcPropertyTemplate {
    constructor() {
        /** @type {IFCLABEL} */
        this.UsageName = null;
        /** @type {IFCCOMPLEXPROPERTYTEMPLATETYPEENUM} */
        this.TemplateType = null;
        /** @type {SET [1:?] OF IFCPROPERTYTEMPLATE} */
        this.HasPropertyTemplates = null;
    }

    // === WHERE CLAUSES ===
    // NoSelfReference : SIZEOF(QUERY(temp <* HasPropertyTemplates | SELF :=: temp)) = 0
    // UniquePropertyNames : IfcUniquePropertyTemplateNames(HasPropertyTemplates)
}
