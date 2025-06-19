# SELECT TYPE IfcGridPlacementDirectionSelect
# Options:
# - IfcDirection
# - IfcVirtualGridIntersection
class IfcGridPlacementDirectionSelect:
    def __init__(self, value):
        if not isinstance(value, (IfcDirection, IfcVirtualGridIntersection)):
            raise TypeError("value must be one of: IfcDirection, IfcVirtualGridIntersection")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
