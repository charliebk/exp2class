// SELECT TYPE IfcStructuralActivityAssignmentSelect
public class IfcStructuralActivityAssignmentSelect {
    public object Value { get; }

    public IfcStructuralActivityAssignmentSelect(object value) {
        if (!(value is IfcElement || value is IfcStructuralItem))
        {
            throw new ArgumentException("Value must be one of: IfcElement, IfcStructuralItem");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
