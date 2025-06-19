// SELECT TYPE IfcResourceObjectSelect
// Options:
// - IfcActorRole
// - IfcAppliedValue
// - IfcApproval
// - IfcConstraint
// - IfcContextDependentUnit
// - IfcConversionBasedUnit
// - IfcExternalInformation
// - IfcExternalReference
// - IfcMaterialDefinition
// - IfcOrganization
// - IfcPerson
// - IfcPersonAndOrganization
// - IfcPhysicalQuantity
// - IfcProfileDef
// - IfcPropertyAbstraction
// - IfcShapeAspect
// - IfcTimeSeries
class IfcResourceObjectSelect {
    constructor(value) {
        if (!(value instanceof IfcActorRole || value instanceof IfcAppliedValue || value instanceof IfcApproval || value instanceof IfcConstraint || value instanceof IfcContextDependentUnit || value instanceof IfcConversionBasedUnit || value instanceof IfcExternalInformation || value instanceof IfcExternalReference || value instanceof IfcMaterialDefinition || value instanceof IfcOrganization || value instanceof IfcPerson || value instanceof IfcPersonAndOrganization || value instanceof IfcPhysicalQuantity || value instanceof IfcProfileDef || value instanceof IfcPropertyAbstraction || value instanceof IfcShapeAspect || value instanceof IfcTimeSeries)) {
            throw new Error("Value must be one of: IfcActorRole, IfcAppliedValue, IfcApproval, IfcConstraint, IfcContextDependentUnit, IfcConversionBasedUnit, IfcExternalInformation, IfcExternalReference, IfcMaterialDefinition, IfcOrganization, IfcPerson, IfcPersonAndOrganization, IfcPhysicalQuantity, IfcProfileDef, IfcPropertyAbstraction, IfcShapeAspect, IfcTimeSeries");
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
