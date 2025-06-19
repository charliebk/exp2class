// SELECT TYPE IfcResourceObjectSelect
public class IfcResourceObjectSelect {
    public object Value { get; }

    public IfcResourceObjectSelect(object value) {
        if (!(value is IfcActorRole || value is IfcAppliedValue || value is IfcApproval || value is IfcConstraint || value is IfcContextDependentUnit || value is IfcConversionBasedUnit || value is IfcExternalInformation || value is IfcExternalReference || value is IfcMaterialDefinition || value is IfcOrganization || value is IfcPerson || value is IfcPersonAndOrganization || value is IfcPhysicalQuantity || value is IfcProfileDef || value is IfcPropertyAbstraction || value is IfcShapeAspect || value is IfcTimeSeries))
        {
            throw new ArgumentException("Value must be one of: IfcActorRole, IfcAppliedValue, IfcApproval, IfcConstraint, IfcContextDependentUnit, IfcConversionBasedUnit, IfcExternalInformation, IfcExternalReference, IfcMaterialDefinition, IfcOrganization, IfcPerson, IfcPersonAndOrganization, IfcPhysicalQuantity, IfcProfileDef, IfcPropertyAbstraction, IfcShapeAspect, IfcTimeSeries");
        }
        Value = value;
    }

    public T GetValueAs<T>() {
        return (T)Value;
    }
}
