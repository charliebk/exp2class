# SELECT TYPE IfcObjectReferenceSelect
# Options:
# - IfcAddress
# - IfcAppliedValue
# - IfcExternalReference
# - IfcMaterialDefinition
# - IfcOrganization
# - IfcPerson
# - IfcPersonAndOrganization
# - IfcTable
# - IfcTimeSeries
class IfcObjectReferenceSelect:
    def __init__(self, value):
        if not isinstance(value, (IfcAddress, IfcAppliedValue, IfcExternalReference, IfcMaterialDefinition, IfcOrganization, IfcPerson, IfcPersonAndOrganization, IfcTable, IfcTimeSeries)):
            raise TypeError("value must be one of: IfcAddress, IfcAppliedValue, IfcExternalReference, IfcMaterialDefinition, IfcOrganization, IfcPerson, IfcPersonAndOrganization, IfcTable, IfcTimeSeries")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
