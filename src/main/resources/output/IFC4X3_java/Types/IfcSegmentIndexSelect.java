// SELECT TYPE IfcSegmentIndexSelect
public class IfcSegmentIndexSelect {
    public Object value;

    public IfcSegmentIndexSelect(Object value) {
        if (!(value instanceof IfcArcIndex || value instanceof IfcLineIndex)) {
            throw new IllegalArgumentException("Value must be one of: IfcArcIndex, IfcLineIndex");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
