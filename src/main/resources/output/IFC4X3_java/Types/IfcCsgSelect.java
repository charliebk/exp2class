// SELECT TYPE IfcCsgSelect
public class IfcCsgSelect {
    public Object value;

    public IfcCsgSelect(Object value) {
        if (!(value instanceof IfcBooleanResult || value instanceof IfcCsgPrimitive3D)) {
            throw new IllegalArgumentException("Value must be one of: IfcBooleanResult, IfcCsgPrimitive3D");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
