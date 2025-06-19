// SELECT TYPE IfcCurveOrEdgeCurve
public class IfcCurveOrEdgeCurve {
    public object Value { get; }

    public IfcCurveOrEdgeCurve(object value) {
        if (!(value is IfcBoundedCurve || value is IfcEdgeCurve))
        {
            throw new ArgumentException("Value must be one of: IfcBoundedCurve, IfcEdgeCurve");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
