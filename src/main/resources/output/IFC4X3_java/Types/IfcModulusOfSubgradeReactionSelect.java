// SELECT TYPE IfcModulusOfSubgradeReactionSelect
public class IfcModulusOfSubgradeReactionSelect {
    public Object value;

    public IfcModulusOfSubgradeReactionSelect(Object value) {
        if (!(value instanceof IfcBoolean || value instanceof IfcModulusOfSubgradeReactionMeasure)) {
            throw new IllegalArgumentException("Value must be one of: IfcBoolean, IfcModulusOfSubgradeReactionMeasure");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
