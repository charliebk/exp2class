# SELECT TYPE IfcProductRepresentationSelect
# Options:
# - IfcProductDefinitionShape
# - IfcRepresentationMap
class IfcProductRepresentationSelect:
    def __init__(self, value):
        if not isinstance(value, (IfcProductDefinitionShape, IfcRepresentationMap)):
            raise TypeError("value must be one of: IfcProductDefinitionShape, IfcRepresentationMap")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
