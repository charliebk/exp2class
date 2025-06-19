# SELECT TYPE IfcPropertySetDefinitionSelect
# Options:
# - IfcPropertySetDefinition
# - IfcPropertySetDefinitionSet
class IfcPropertySetDefinitionSelect:
    def __init__(self, value):
        if not isinstance(value, (IfcPropertySetDefinition, IfcPropertySetDefinitionSet)):
            raise TypeError("value must be one of: IfcPropertySetDefinition, IfcPropertySetDefinitionSet")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
