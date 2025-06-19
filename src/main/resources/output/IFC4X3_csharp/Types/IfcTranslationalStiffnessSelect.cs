// SELECT TYPE IfcTranslationalStiffnessSelect
public class IfcTranslationalStiffnessSelect {
    public object Value { get; }

    public IfcTranslationalStiffnessSelect(object value) {
        if (!(value is IfcBoolean || value is IfcLinearStiffnessMeasure))
        {
            throw new ArgumentException("Value must be one of: IfcBoolean, IfcLinearStiffnessMeasure");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
