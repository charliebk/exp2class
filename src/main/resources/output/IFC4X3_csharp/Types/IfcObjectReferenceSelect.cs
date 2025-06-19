// SELECT TYPE IfcObjectReferenceSelect
public class IfcObjectReferenceSelect {
    public object Value { get; }

    public IfcObjectReferenceSelect(object value) {
        if (!(value is IfcAddress || value is IfcAppliedValue || value is IfcExternalReference || value is IfcMaterialDefinition || value is IfcOrganization || value is IfcPerson || value is IfcPersonAndOrganization || value is IfcTable || value is IfcTimeSeries))
        {
            throw new ArgumentException("Value must be one of: IfcAddress, IfcAppliedValue, IfcExternalReference, IfcMaterialDefinition, IfcOrganization, IfcPerson, IfcPersonAndOrganization, IfcTable, IfcTimeSeries");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
