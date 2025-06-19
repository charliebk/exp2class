// SELECT TYPE IfcGridPlacementDirectionSelect
public class IfcGridPlacementDirectionSelect {
    public Object value;

    public IfcGridPlacementDirectionSelect(Object value) {
        if (!(value instanceof IfcDirection || value instanceof IfcVirtualGridIntersection)) {
            throw new IllegalArgumentException("Value must be one of: IfcDirection, IfcVirtualGridIntersection");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
