# SELECT TYPE IfcBooleanOperand
# Options:
# - IfcBooleanResult
# - IfcCsgPrimitive3D
# - IfcHalfSpaceSolid
# - IfcSolidModel
# - IfcTessellatedFaceSet
class IfcBooleanOperand:
    def __init__(self, value):
        if not isinstance(value, (IfcBooleanResult, IfcCsgPrimitive3D, IfcHalfSpaceSolid, IfcSolidModel, IfcTessellatedFaceSet)):
            raise TypeError("value must be one of: IfcBooleanResult, IfcCsgPrimitive3D, IfcHalfSpaceSolid, IfcSolidModel, IfcTessellatedFaceSet")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
