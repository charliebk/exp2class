// SELECT TYPE IfcCurveOrEdgeCurve
public class IfcCurveOrEdgeCurve {
    public Object value;

    public IfcCurveOrEdgeCurve(Object value) {
        if (!(value instanceof IfcBoundedCurve || value instanceof IfcEdgeCurve)) {
            throw new IllegalArgumentException("Value must be one of: IfcBoundedCurve, IfcEdgeCurve");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
