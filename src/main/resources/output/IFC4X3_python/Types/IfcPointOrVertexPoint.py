# SELECT TYPE IfcPointOrVertexPoint
# Options:
# - IfcPoint
# - IfcVertexPoint
class IfcPointOrVertexPoint:
    def __init__(self, value):
        if not isinstance(value, (IfcPoint, IfcVertexPoint)):
            raise TypeError("value must be one of: IfcPoint, IfcVertexPoint")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
