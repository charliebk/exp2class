# SELECT TYPE IfcResourceSelect
# Options:
# - IfcResource
# - IfcTypeResource
class IfcResourceSelect:
    def __init__(self, value):
        if not isinstance(value, (IfcResource, IfcTypeResource)):
            raise TypeError("value must be one of: IfcResource, IfcTypeResource")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
