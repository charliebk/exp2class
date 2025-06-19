// SELECT TYPE IfcHatchLineDistanceSelect
public class IfcHatchLineDistanceSelect {
    public object Value { get; }

    public IfcHatchLineDistanceSelect(object value) {
        if (!(value is IfcPositiveLengthMeasure || value is IfcVector))
        {
            throw new ArgumentException("Value must be one of: IfcPositiveLengthMeasure, IfcVector");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
