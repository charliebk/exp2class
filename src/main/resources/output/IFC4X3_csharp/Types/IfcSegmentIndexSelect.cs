// SELECT TYPE IfcSegmentIndexSelect
public class IfcSegmentIndexSelect {
    public object Value { get; }

    public IfcSegmentIndexSelect(object value) {
        if (!(value is IfcArcIndex || value is IfcLineIndex))
        {
            throw new ArgumentException("Value must be one of: IfcArcIndex, IfcLineIndex");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
