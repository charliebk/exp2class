# SELECT TYPE IfcResourceObjectSelect
# Options:
# - IfcActorRole
# - IfcAppliedValue
# - IfcApproval
# - IfcConstraint
# - IfcContextDependentUnit
# - IfcConversionBasedUnit
# - IfcExternalInformation
# - IfcExternalReference
# - IfcMaterialDefinition
# - IfcOrganization
# - IfcPerson
# - IfcPersonAndOrganization
# - IfcPhysicalQuantity
# - IfcProfileDef
# - IfcPropertyAbstraction
# - IfcShapeAspect
# - IfcTimeSeries
class IfcResourceObjectSelect:
    def __init__(self, value):
        if not isinstance(value, (IfcActorRole, IfcAppliedValue, IfcApproval, IfcConstraint, IfcContextDependentUnit, IfcConversionBasedUnit, IfcExternalInformation, IfcExternalReference, IfcMaterialDefinition, IfcOrganization, IfcPerson, IfcPersonAndOrganization, IfcPhysicalQuantity, IfcProfileDef, IfcPropertyAbstraction, IfcShapeAspect, IfcTimeSeries)):
            raise TypeError("value must be one of: IfcActorRole, IfcAppliedValue, IfcApproval, IfcConstraint, IfcContextDependentUnit, IfcConversionBasedUnit, IfcExternalInformation, IfcExternalReference, IfcMaterialDefinition, IfcOrganization, IfcPerson, IfcPersonAndOrganization, IfcPhysicalQuantity, IfcProfileDef, IfcPropertyAbstraction, IfcShapeAspect, IfcTimeSeries")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
