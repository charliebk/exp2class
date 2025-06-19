// SELECT TYPE IfcSimpleValue
public class IfcSimpleValue {
    public Object value;

    public IfcSimpleValue(Object value) {
        if (!(value instanceof IfcBinary || value instanceof IfcBoolean || value instanceof IfcDate || value instanceof IfcDateTime || value instanceof IfcDuration || value instanceof IfcIdentifier || value instanceof IfcInteger || value instanceof IfcLabel || value instanceof IfcLogical || value instanceof IfcPositiveInteger || value instanceof IfcReal || value instanceof IfcText || value instanceof IfcTime || value instanceof IfcTimeStamp || value instanceof IfcURIReference)) {
            throw new IllegalArgumentException("Value must be one of: IfcBinary, IfcBoolean, IfcDate, IfcDateTime, IfcDuration, IfcIdentifier, IfcInteger, IfcLabel, IfcLogical, IfcPositiveInteger, IfcReal, IfcText, IfcTime, IfcTimeStamp, IfcURIReference");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
