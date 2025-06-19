// SELECT TYPE IfcBooleanOperand
public class IfcBooleanOperand {
    public Object value;

    public IfcBooleanOperand(Object value) {
        if (!(value instanceof IfcBooleanResult || value instanceof IfcCsgPrimitive3D || value instanceof IfcHalfSpaceSolid || value instanceof IfcSolidModel || value instanceof IfcTessellatedFaceSet)) {
            throw new IllegalArgumentException("Value must be one of: IfcBooleanResult, IfcCsgPrimitive3D, IfcHalfSpaceSolid, IfcSolidModel, IfcTessellatedFaceSet");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
