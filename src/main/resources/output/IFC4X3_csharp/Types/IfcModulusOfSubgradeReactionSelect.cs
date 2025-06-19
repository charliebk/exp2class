// SELECT TYPE IfcModulusOfSubgradeReactionSelect
public class IfcModulusOfSubgradeReactionSelect {
    public object Value { get; }

    public IfcModulusOfSubgradeReactionSelect(object value) {
        if (!(value is IfcBoolean || value is IfcModulusOfSubgradeReactionMeasure))
        {
            throw new ArgumentException("Value must be one of: IfcBoolean, IfcModulusOfSubgradeReactionMeasure");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
