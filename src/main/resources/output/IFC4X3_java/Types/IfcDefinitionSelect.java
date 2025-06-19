// SELECT TYPE IfcDefinitionSelect
public class IfcDefinitionSelect {
    public Object value;

    public IfcDefinitionSelect(Object value) {
        if (!(value instanceof IfcObjectDefinition || value instanceof IfcPropertyDefinition)) {
            throw new IllegalArgumentException("Value must be one of: IfcObjectDefinition, IfcPropertyDefinition");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
