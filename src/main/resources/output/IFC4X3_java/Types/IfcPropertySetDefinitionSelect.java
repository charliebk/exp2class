// SELECT TYPE IfcPropertySetDefinitionSelect
public class IfcPropertySetDefinitionSelect {
    public Object value;

    public IfcPropertySetDefinitionSelect(Object value) {
        if (!(value instanceof IfcPropertySetDefinition || value instanceof IfcPropertySetDefinitionSet)) {
            throw new IllegalArgumentException("Value must be one of: IfcPropertySetDefinition, IfcPropertySetDefinitionSet");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
