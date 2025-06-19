# SELECT TYPE IfcGeometricSetSelect
# Options:
# - IfcCurve
# - IfcPoint
# - IfcSurface
class IfcGeometricSetSelect:
    def __init__(self, value):
        if not isinstance(value, (IfcCurve, IfcPoint, IfcSurface)):
            raise TypeError("value must be one of: IfcCurve, IfcPoint, IfcSurface")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
