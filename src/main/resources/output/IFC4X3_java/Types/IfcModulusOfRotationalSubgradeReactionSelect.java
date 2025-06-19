// SELECT TYPE IfcModulusOfRotationalSubgradeReactionSelect
public class IfcModulusOfRotationalSubgradeReactionSelect {
    public Object value;

    public IfcModulusOfRotationalSubgradeReactionSelect(Object value) {
        if (!(value instanceof IfcBoolean || value instanceof IfcModulusOfRotationalSubgradeReactionMeasure)) {
            throw new IllegalArgumentException("Value must be one of: IfcBoolean, IfcModulusOfRotationalSubgradeReactionMeasure");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
