public class IfcPropertySet : IfcPropertySetDefinition
{
    public SET [1:?] OF IfcProperty HasProperties { get; set; }

    // === WHERE CLAUSES ===
    // ExistsName : EXISTS(SELF\IfcRoot.Name)
    // UniquePropertyNames : IfcUniquePropertyName(HasProperties)
}
