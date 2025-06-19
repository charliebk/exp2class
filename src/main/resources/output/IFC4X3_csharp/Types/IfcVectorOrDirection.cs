// SELECT TYPE IfcVectorOrDirection
public class IfcVectorOrDirection {
    public object Value { get; }

    public IfcVectorOrDirection(object value) {
        if (!(value is IfcDirection || value is IfcVector))
        {
            throw new ArgumentException("Value must be one of: IfcDirection, IfcVector");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
