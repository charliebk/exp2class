// SELECT TYPE IfcPointOrVertexPoint
public class IfcPointOrVertexPoint {
    public object Value { get; }

    public IfcPointOrVertexPoint(object value) {
        if (!(value is IfcPoint || value is IfcVertexPoint))
        {
            throw new ArgumentException("Value must be one of: IfcPoint, IfcVertexPoint");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
