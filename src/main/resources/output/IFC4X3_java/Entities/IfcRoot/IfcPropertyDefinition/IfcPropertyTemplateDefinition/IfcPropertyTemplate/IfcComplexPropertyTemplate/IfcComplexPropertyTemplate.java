public class IfcComplexPropertyTemplate extends IfcPropertyTemplate {
    public IfcLabel UsageName;
    public IfcComplexPropertyTemplateTypeEnum TemplateType;
    public SET [1:?] OF IfcPropertyTemplate HasPropertyTemplates;

    // === WHERE CLAUSES ===
    // NoSelfReference : SIZEOF(QUERY(temp <* HasPropertyTemplates | SELF :=: temp)) = 0
    // UniquePropertyNames : IfcUniquePropertyTemplateNames(HasPropertyTemplates)
}
