// SELECT TYPE IfcAppliedValueSelect
public class IfcAppliedValueSelect {
    public object Value { get; }

    public IfcAppliedValueSelect(object value) {
        if (!(value is IfcMeasureWithUnit || value is IfcReference || value is IfcValue))
        {
            throw new ArgumentException("Value must be one of: IfcMeasureWithUnit, IfcReference, IfcValue");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
