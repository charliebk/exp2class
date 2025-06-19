// SELECT TYPE IfcGeometricSetSelect
public class IfcGeometricSetSelect {
    public object Value { get; }

    public IfcGeometricSetSelect(object value) {
        if (!(value is IfcCurve || value is IfcPoint || value is IfcSurface))
        {
            throw new ArgumentException("Value must be one of: IfcCurve, IfcPoint, IfcSurface");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
