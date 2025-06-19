// SELECT TYPE IfcModulusOfTranslationalSubgradeReactionSelect
public class IfcModulusOfTranslationalSubgradeReactionSelect {
    public object Value { get; }

    public IfcModulusOfTranslationalSubgradeReactionSelect(object value) {
        if (!(value is IfcBoolean || value is IfcModulusOfLinearSubgradeReactionMeasure))
        {
            throw new ArgumentException("Value must be one of: IfcBoolean, IfcModulusOfLinearSubgradeReactionMeasure");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
