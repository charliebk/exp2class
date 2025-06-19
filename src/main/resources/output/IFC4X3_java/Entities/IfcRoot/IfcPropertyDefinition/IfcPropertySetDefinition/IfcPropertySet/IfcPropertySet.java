public class IfcPropertySet extends IfcPropertySetDefinition {
    public SET [1:?] OF IfcProperty HasProperties;

    // === WHERE CLAUSES ===
    // ExistsName : EXISTS(SELF\IfcRoot.Name)
    // UniquePropertyNames : IfcUniquePropertyName(HasProperties)
}
