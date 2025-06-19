// SELECT TYPE IfcProcessSelect
public class IfcProcessSelect {
    public object Value { get; }

    public IfcProcessSelect(object value) {
        if (!(value is IfcProcess || value is IfcTypeProcess))
        {
            throw new ArgumentException("Value must be one of: IfcProcess, IfcTypeProcess");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
