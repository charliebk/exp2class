// SELECT TYPE IfcPropertySetDefinitionSelect
public class IfcPropertySetDefinitionSelect {
    public object Value { get; }

    public IfcPropertySetDefinitionSelect(object value) {
        if (!(value is IfcPropertySetDefinition || value is IfcPropertySetDefinitionSet))
        {
            throw new ArgumentException("Value must be one of: IfcPropertySetDefinition, IfcPropertySetDefinitionSet");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
