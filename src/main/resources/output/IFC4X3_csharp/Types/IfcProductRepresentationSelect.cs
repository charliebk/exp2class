// SELECT TYPE IfcProductRepresentationSelect
public class IfcProductRepresentationSelect {
    public object Value { get; }

    public IfcProductRepresentationSelect(object value) {
        if (!(value is IfcProductDefinitionShape || value is IfcRepresentationMap))
        {
            throw new ArgumentException("Value must be one of: IfcProductDefinitionShape, IfcRepresentationMap");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
