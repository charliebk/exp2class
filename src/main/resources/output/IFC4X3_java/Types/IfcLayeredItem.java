// SELECT TYPE IfcLayeredItem
public class IfcLayeredItem {
    public Object value;

    public IfcLayeredItem(Object value) {
        if (!(value instanceof IfcRepresentation || value instanceof IfcRepresentationItem)) {
            throw new IllegalArgumentException("Value must be one of: IfcRepresentation, IfcRepresentationItem");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
