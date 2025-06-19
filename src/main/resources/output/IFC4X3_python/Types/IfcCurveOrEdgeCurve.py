# SELECT TYPE IfcCurveOrEdgeCurve
# Options:
# - IfcBoundedCurve
# - IfcEdgeCurve
class IfcCurveOrEdgeCurve:
    def __init__(self, value):
        if not isinstance(value, (IfcBoundedCurve, IfcEdgeCurve)):
            raise TypeError("value must be one of: IfcBoundedCurve, IfcEdgeCurve")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
