public class IfcPropertySetTemplate : IfcPropertyTemplateDefinition
{
    public IfcPropertySetTemplateTypeEnum TemplateType { get; set; }
    public IfcIdentifier ApplicableEntity { get; set; }
    public SET [1:?] OF IfcPropertyTemplate HasPropertyTemplates { get; set; }

    // === INVERSE CLAUSES ===
    // Defines : SET [0:?] OF IfcRelDefinesByTemplate FOR RelatingTemplate

    // === WHERE CLAUSES ===
    // ExistsName : EXISTS(SELF\IfcRoot.Name)
    // UniquePropertyNames : IfcUniquePropertyTemplateNames(HasPropertyTemplates)
}
