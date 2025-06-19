# SELECT TYPE IfcDefinitionSelect
# Options:
# - IfcObjectDefinition
# - IfcPropertyDefinition
class IfcDefinitionSelect:
    def __init__(self, value):
        if not isinstance(value, (IfcObjectDefinition, IfcPropertyDefinition)):
            raise TypeError("value must be one of: IfcObjectDefinition, IfcPropertyDefinition")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
