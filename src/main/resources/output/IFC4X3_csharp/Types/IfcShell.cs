// SELECT TYPE IfcShell
public class IfcShell {
    public object Value { get; }

    public IfcShell(object value) {
        if (!(value is IfcClosedShell || value is IfcOpenShell))
        {
            throw new ArgumentException("Value must be one of: IfcClosedShell, IfcOpenShell");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
