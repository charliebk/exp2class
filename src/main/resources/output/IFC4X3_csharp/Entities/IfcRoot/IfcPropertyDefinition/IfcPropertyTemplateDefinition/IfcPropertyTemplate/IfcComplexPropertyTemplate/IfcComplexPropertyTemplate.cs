public class IfcComplexPropertyTemplate : IfcPropertyTemplate
{
    public IfcLabel UsageName { get; set; }
    public IfcComplexPropertyTemplateTypeEnum TemplateType { get; set; }
    public SET [1:?] OF IfcPropertyTemplate HasPropertyTemplates { get; set; }

    // === WHERE CLAUSES ===
    // NoSelfReference : SIZEOF(QUERY(temp <* HasPropertyTemplates | SELF :=: temp)) = 0
    // UniquePropertyNames : IfcUniquePropertyTemplateNames(HasPropertyTemplates)
}
