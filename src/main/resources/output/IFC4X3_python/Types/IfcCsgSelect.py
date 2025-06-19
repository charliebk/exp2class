# SELECT TYPE IfcCsgSelect
# Options:
# - IfcBooleanResult
# - IfcCsgPrimitive3D
class IfcCsgSelect:
    def __init__(self, value):
        if not isinstance(value, (IfcBooleanResult, IfcCsgPrimitive3D)):
            raise TypeError("value must be one of: IfcBooleanResult, IfcCsgPrimitive3D")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
