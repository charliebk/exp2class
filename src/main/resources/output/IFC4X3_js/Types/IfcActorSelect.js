// SELECT TYPE IfcActorSelect
// Options:
// - IfcOrganization
// - IfcPerson
// - IfcPersonAndOrganization
class IfcActorSelect {
    constructor(value) {
        if (!(value instanceof IfcOrganization || value instanceof IfcPerson || value instanceof IfcPersonAndOrganization)) {
            throw new Error("Value must be one of: IfcOrganization, IfcPerson, IfcPersonAndOrganization");
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
