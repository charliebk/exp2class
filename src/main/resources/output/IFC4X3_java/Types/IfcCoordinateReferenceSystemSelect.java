// SELECT TYPE IfcCoordinateReferenceSystemSelect
public class IfcCoordinateReferenceSystemSelect {
    public Object value;

    public IfcCoordinateReferenceSystemSelect(Object value) {
        if (!(value instanceof IfcCoordinateReferenceSystem || value instanceof IfcGeometricRepresentationContext)) {
            throw new IllegalArgumentException("Value must be one of: IfcCoordinateReferenceSystem, IfcGeometricRepresentationContext");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
