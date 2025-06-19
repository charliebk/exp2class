// SELECT TYPE IfcPointOrVertexPoint
public class IfcPointOrVertexPoint {
    public Object value;

    public IfcPointOrVertexPoint(Object value) {
        if (!(value instanceof IfcPoint || value instanceof IfcVertexPoint)) {
            throw new IllegalArgumentException("Value must be one of: IfcPoint, IfcVertexPoint");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
