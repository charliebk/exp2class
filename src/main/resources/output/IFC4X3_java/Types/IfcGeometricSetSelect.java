// SELECT TYPE IfcGeometricSetSelect
public class IfcGeometricSetSelect {
    public Object value;

    public IfcGeometricSetSelect(Object value) {
        if (!(value instanceof IfcCurve || value instanceof IfcPoint || value instanceof IfcSurface)) {
            throw new IllegalArgumentException("Value must be one of: IfcCurve, IfcPoint, IfcSurface");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
