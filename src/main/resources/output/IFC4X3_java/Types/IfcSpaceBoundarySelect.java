// SELECT TYPE IfcSpaceBoundarySelect
public class IfcSpaceBoundarySelect {
    public Object value;

    public IfcSpaceBoundarySelect(Object value) {
        if (!(value instanceof IfcExternalSpatialElement || value instanceof IfcSpace)) {
            throw new IllegalArgumentException("Value must be one of: IfcExternalSpatialElement, IfcSpace");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
