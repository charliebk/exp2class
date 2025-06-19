public class IfcPropertySetTemplate extends IfcPropertyTemplateDefinition {
    public IfcPropertySetTemplateTypeEnum TemplateType;
    public IfcIdentifier ApplicableEntity;
    public SET [1:?] OF IfcPropertyTemplate HasPropertyTemplates;

    // === INVERSE CLAUSES ===
    // Defines : SET [0:?] OF IfcRelDefinesByTemplate FOR RelatingTemplate

    // === WHERE CLAUSES ===
    // ExistsName : EXISTS(SELF\IfcRoot.Name)
    // UniquePropertyNames : IfcUniquePropertyTemplateNames(HasPropertyTemplates)
}
