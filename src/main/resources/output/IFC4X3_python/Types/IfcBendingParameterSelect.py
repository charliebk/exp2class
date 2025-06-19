# SELECT TYPE IfcBendingParameterSelect
# Options:
# - IfcLengthMeasure
# - IfcPlaneAngleMeasure
class IfcBendingParameterSelect:
    def __init__(self, value):
        if not isinstance(value, (IfcLengthMeasure, IfcPlaneAngleMeasure)):
            raise TypeError("value must be one of: IfcLengthMeasure, IfcPlaneAngleMeasure")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
