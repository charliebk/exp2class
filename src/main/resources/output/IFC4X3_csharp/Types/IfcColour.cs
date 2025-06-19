// SELECT TYPE IfcColour
public class IfcColour {
    public object Value { get; }

    public IfcColour(object value) {
        if (!(value is IfcColourSpecification || value is IfcPreDefinedColour))
        {
            throw new ArgumentException("Value must be one of: IfcColourSpecification, IfcPreDefinedColour");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
