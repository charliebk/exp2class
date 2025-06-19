// SELECT TYPE IfcUnit
public class IfcUnit {
    public object Value { get; }

    public IfcUnit(object value) {
        if (!(value is IfcDerivedUnit || value is IfcMonetaryUnit || value is IfcNamedUnit))
        {
            throw new ArgumentException("Value must be one of: IfcDerivedUnit, IfcMonetaryUnit, IfcNamedUnit");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
