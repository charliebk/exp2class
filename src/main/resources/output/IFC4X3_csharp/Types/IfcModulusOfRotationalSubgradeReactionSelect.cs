// SELECT TYPE IfcModulusOfRotationalSubgradeReactionSelect
public class IfcModulusOfRotationalSubgradeReactionSelect {
    public object Value { get; }

    public IfcModulusOfRotationalSubgradeReactionSelect(object value) {
        if (!(value is IfcBoolean || value is IfcModulusOfRotationalSubgradeReactionMeasure))
        {
            throw new ArgumentException("Value must be one of: IfcBoolean, IfcModulusOfRotationalSubgradeReactionMeasure");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
