// SELECT TYPE IfcMaterialSelect
public class IfcMaterialSelect {
    public Object value;

    public IfcMaterialSelect(Object value) {
        if (!(value instanceof IfcMaterialDefinition || value instanceof IfcMaterialList || value instanceof IfcMaterialUsageDefinition)) {
            throw new IllegalArgumentException("Value must be one of: IfcMaterialDefinition, IfcMaterialList, IfcMaterialUsageDefinition");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
