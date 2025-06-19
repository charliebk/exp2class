// SELECT TYPE IfcObjectReferenceSelect
public class IfcObjectReferenceSelect {
    public Object value;

    public IfcObjectReferenceSelect(Object value) {
        if (!(value instanceof IfcAddress || value instanceof IfcAppliedValue || value instanceof IfcExternalReference || value instanceof IfcMaterialDefinition || value instanceof IfcOrganization || value instanceof IfcPerson || value instanceof IfcPersonAndOrganization || value instanceof IfcTable || value instanceof IfcTimeSeries)) {
            throw new IllegalArgumentException("Value must be one of: IfcAddress, IfcAppliedValue, IfcExternalReference, IfcMaterialDefinition, IfcOrganization, IfcPerson, IfcPersonAndOrganization, IfcTable, IfcTimeSeries");
        }
        this.value = value;
    }

    public <T> T getValueAs(Class<T> clazz) {
        return clazz.cast(value);
    }
}
