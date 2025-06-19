// SELECT TYPE IfcCsgSelect
public class IfcCsgSelect {
    public object Value { get; }

    public IfcCsgSelect(object value) {
        if (!(value is IfcBooleanResult || value is IfcCsgPrimitive3D))
        {
            throw new ArgumentException("Value must be one of: IfcBooleanResult, IfcCsgPrimitive3D");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
