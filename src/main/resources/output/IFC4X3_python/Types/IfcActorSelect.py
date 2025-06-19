# SELECT TYPE IfcActorSelect
# Options:
# - IfcOrganization
# - IfcPerson
# - IfcPersonAndOrganization
class IfcActorSelect:
    def __init__(self, value):
        if not isinstance(value, (IfcOrganization, IfcPerson, IfcPersonAndOrganization)):
            raise TypeError("value must be one of: IfcOrganization, IfcPerson, IfcPersonAndOrganization")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
