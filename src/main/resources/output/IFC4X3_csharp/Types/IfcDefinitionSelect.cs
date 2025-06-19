// SELECT TYPE IfcDefinitionSelect
public class IfcDefinitionSelect {
    public object Value { get; }

    public IfcDefinitionSelect(object value) {
        if (!(value is IfcObjectDefinition || value is IfcPropertyDefinition))
        {
            throw new ArgumentException("Value must be one of: IfcObjectDefinition, IfcPropertyDefinition");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
