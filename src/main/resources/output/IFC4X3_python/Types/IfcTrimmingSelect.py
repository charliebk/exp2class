# SELECT TYPE IfcTrimmingSelect
# Options:
# - IfcCartesianPoint
# - IfcParameterValue
class IfcTrimmingSelect:
    def __init__(self, value):
        if not isinstance(value, (IfcCartesianPoint, IfcParameterValue)):
            raise TypeError("value must be one of: IfcCartesianPoint, IfcParameterValue")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
