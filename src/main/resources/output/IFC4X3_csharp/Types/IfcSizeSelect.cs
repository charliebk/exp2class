// SELECT TYPE IfcSizeSelect
public class IfcSizeSelect {
    public object Value { get; }

    public IfcSizeSelect(object value) {
        if (!(value is IfcDescriptiveMeasure || value is IfcLengthMeasure || value is IfcNormalisedRatioMeasure || value is IfcPositiveLengthMeasure || value is IfcPositiveRatioMeasure || value is IfcRatioMeasure))
        {
            throw new ArgumentException("Value must be one of: IfcDescriptiveMeasure, IfcLengthMeasure, IfcNormalisedRatioMeasure, IfcPositiveLengthMeasure, IfcPositiveRatioMeasure, IfcRatioMeasure");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
