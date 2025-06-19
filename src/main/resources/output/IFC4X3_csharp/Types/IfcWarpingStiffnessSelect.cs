// SELECT TYPE IfcWarpingStiffnessSelect
public class IfcWarpingStiffnessSelect {
    public object Value { get; }

    public IfcWarpingStiffnessSelect(object value) {
        if (!(value is IfcBoolean || value is IfcWarpingMomentMeasure))
        {
            throw new ArgumentException("Value must be one of: IfcBoolean, IfcWarpingMomentMeasure");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
