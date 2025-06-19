// SELECT TYPE IfcColourOrFactor
public class IfcColourOrFactor {
    public object Value { get; }

    public IfcColourOrFactor(object value) {
        if (!(value is IfcColourRgb || value is IfcNormalisedRatioMeasure))
        {
            throw new ArgumentException("Value must be one of: IfcColourRgb, IfcNormalisedRatioMeasure");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
