// SELECT TYPE IfcRotationalStiffnessSelect
public class IfcRotationalStiffnessSelect {
    public object Value { get; }

    public IfcRotationalStiffnessSelect(object value) {
        if (!(value is IfcBoolean || value is IfcRotationalStiffnessMeasure))
        {
            throw new ArgumentException("Value must be one of: IfcBoolean, IfcRotationalStiffnessMeasure");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
