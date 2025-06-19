# SELECT TYPE IfcSpaceBoundarySelect
# Options:
# - IfcExternalSpatialElement
# - IfcSpace
class IfcSpaceBoundarySelect:
    def __init__(self, value):
        if not isinstance(value, (IfcExternalSpatialElement, IfcSpace)):
            raise TypeError("value must be one of: IfcExternalSpatialElement, IfcSpace")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
