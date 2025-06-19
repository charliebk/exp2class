// SELECT TYPE IfcModulusOfTranslationalSubgradeReactionSelect
public class IfcModulusOfTranslationalSubgradeReactionSelect {
    public Object value;

    public IfcModulusOfTranslationalSubgradeReactionSelect(Object value) {
        if (!(value instanceof IfcBoolean || value instanceof IfcModulusOfLinearSubgradeReactionMeasure)) {
            throw new IllegalArgumentException("Value must be one of: IfcBoolean, IfcModulusOfLinearSubgradeReactionMeasure");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
