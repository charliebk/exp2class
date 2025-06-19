// SELECT TYPE IfcSimpleValue
public class IfcSimpleValue {
    public object Value { get; }

    public IfcSimpleValue(object value) {
        if (!(value is IfcBinary || value is IfcBoolean || value is IfcDate || value is IfcDateTime || value is IfcDuration || value is IfcIdentifier || value is IfcInteger || value is IfcLabel || value is IfcLogical || value is IfcPositiveInteger || value is IfcReal || value is IfcText || value is IfcTime || value is IfcTimeStamp || value is IfcURIReference))
        {
            throw new ArgumentException("Value must be one of: IfcBinary, IfcBoolean, IfcDate, IfcDateTime, IfcDuration, IfcIdentifier, IfcInteger, IfcLabel, IfcLogical, IfcPositiveInteger, IfcReal, IfcText, IfcTime, IfcTimeStamp, IfcURIReference");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
