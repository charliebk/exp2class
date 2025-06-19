// SELECT TYPE IfcActorSelect
public class IfcActorSelect {
    public object Value { get; }

    public IfcActorSelect(object value) {
        if (!(value is IfcOrganization || value is IfcPerson || value is IfcPersonAndOrganization))
        {
            throw new ArgumentException("Value must be one of: IfcOrganization, IfcPerson, IfcPersonAndOrganization");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
