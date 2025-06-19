# SELECT TYPE IfcCurveMeasureSelect
# Options:
# - IfcLengthMeasure
# - IfcParameterValue
class IfcCurveMeasureSelect:
    def __init__(self, value):
        if not isinstance(value, (IfcLengthMeasure, IfcParameterValue)):
            raise TypeError("value must be one of: IfcLengthMeasure, IfcParameterValue")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
