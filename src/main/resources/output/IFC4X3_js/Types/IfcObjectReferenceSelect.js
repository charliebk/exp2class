// SELECT TYPE IfcObjectReferenceSelect
// Options:
// - IfcAddress
// - IfcAppliedValue
// - IfcExternalReference
// - IfcMaterialDefinition
// - IfcOrganization
// - IfcPerson
// - IfcPersonAndOrganization
// - IfcTable
// - IfcTimeSeries
class IfcObjectReferenceSelect {
    constructor(value) {
        if (!(value instanceof IfcAddress || value instanceof IfcAppliedValue || value instanceof IfcExternalReference || value instanceof IfcMaterialDefinition || value instanceof IfcOrganization || value instanceof IfcPerson || value instanceof IfcPersonAndOrganization || value instanceof IfcTable || value instanceof IfcTimeSeries)) {
            throw new Error("Value must be one of: IfcAddress, IfcAppliedValue, IfcExternalReference, IfcMaterialDefinition, IfcOrganization, IfcPerson, IfcPersonAndOrganization, IfcTable, IfcTimeSeries");
        }
        this.value = value;
    }

    getValueAs(TypeClass) {
        if (this.value instanceof TypeClass) {
            return this.value;
        } else {
            throw new Error("Stored value is not of the requested type");
        }
    }
}
