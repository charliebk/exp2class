# SELECT TYPE IfcLayeredItem
# Options:
# - IfcRepresentation
# - IfcRepresentationItem
class IfcLayeredItem:
    def __init__(self, value):
        if not isinstance(value, (IfcRepresentation, IfcRepresentationItem)):
            raise TypeError("value must be one of: IfcRepresentation, IfcRepresentationItem")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
