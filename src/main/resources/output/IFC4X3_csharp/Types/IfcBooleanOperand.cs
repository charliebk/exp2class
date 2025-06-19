// SELECT TYPE IfcBooleanOperand
public class IfcBooleanOperand {
    public object Value { get; }

    public IfcBooleanOperand(object value) {
        if (!(value is IfcBooleanResult || value is IfcCsgPrimitive3D || value is IfcHalfSpaceSolid || value is IfcSolidModel || value is IfcTessellatedFaceSet))
        {
            throw new ArgumentException("Value must be one of: IfcBooleanResult, IfcCsgPrimitive3D, IfcHalfSpaceSolid, IfcSolidModel, IfcTessellatedFaceSet");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
