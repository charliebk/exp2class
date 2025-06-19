// SELECT TYPE IfcAxis2Placement
public class IfcAxis2Placement {
    public Object value;

    public IfcAxis2Placement(Object value) {
        if (!(value instanceof IfcAxis2Placement2D || value instanceof IfcAxis2Placement3D)) {
            throw new IllegalArgumentException("Value must be one of: IfcAxis2Placement2D, IfcAxis2Placement3D");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
