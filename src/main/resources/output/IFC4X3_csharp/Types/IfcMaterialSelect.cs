// SELECT TYPE IfcMaterialSelect
public class IfcMaterialSelect {
    public object Value { get; }

    public IfcMaterialSelect(object value) {
        if (!(value is IfcMaterialDefinition || value is IfcMaterialList || value is IfcMaterialUsageDefinition))
        {
            throw new ArgumentException("Value must be one of: IfcMaterialDefinition, IfcMaterialList, IfcMaterialUsageDefinition");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
