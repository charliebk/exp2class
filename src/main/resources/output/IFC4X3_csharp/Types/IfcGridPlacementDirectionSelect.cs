// SELECT TYPE IfcGridPlacementDirectionSelect
public class IfcGridPlacementDirectionSelect {
    public object Value { get; }

    public IfcGridPlacementDirectionSelect(object value) {
        if (!(value is IfcDirection || value is IfcVirtualGridIntersection))
        {
            throw new ArgumentException("Value must be one of: IfcDirection, IfcVirtualGridIntersection");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
