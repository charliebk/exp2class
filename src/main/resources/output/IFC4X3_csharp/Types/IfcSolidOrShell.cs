// SELECT TYPE IfcSolidOrShell
public class IfcSolidOrShell {
    public object Value { get; }

    public IfcSolidOrShell(object value) {
        if (!(value is IfcClosedShell || value is IfcSolidModel))
        {
            throw new ArgumentException("Value must be one of: IfcClosedShell, IfcSolidModel");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
