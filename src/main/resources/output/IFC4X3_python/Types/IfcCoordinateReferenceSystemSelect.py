# SELECT TYPE IfcCoordinateReferenceSystemSelect
# Options:
# - IfcCoordinateReferenceSystem
# - IfcGeometricRepresentationContext
class IfcCoordinateReferenceSystemSelect:
    def __init__(self, value):
        if not isinstance(value, (IfcCoordinateReferenceSystem, IfcGeometricRepresentationContext)):
            raise TypeError("value must be one of: IfcCoordinateReferenceSystem, IfcGeometricRepresentationContext")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
