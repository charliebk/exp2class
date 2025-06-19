# SELECT TYPE IfcSpatialReferenceSelect
# Options:
# - IfcGroup
# - IfcProduct
class IfcSpatialReferenceSelect:
    def __init__(self, value):
        if not isinstance(value, (IfcGroup, IfcProduct)):
            raise TypeError("value must be one of: IfcGroup, IfcProduct")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
