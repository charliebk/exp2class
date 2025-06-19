// SELECT TYPE IfcAxis2Placement
public class IfcAxis2Placement {
    public object Value { get; }

    public IfcAxis2Placement(object value) {
        if (!(value is IfcAxis2Placement2D || value is IfcAxis2Placement3D))
        {
            throw new ArgumentException("Value must be one of: IfcAxis2Placement2D, IfcAxis2Placement3D");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
