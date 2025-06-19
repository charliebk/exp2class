# SELECT TYPE IfcHatchLineDistanceSelect
# Options:
# - IfcPositiveLengthMeasure
# - IfcVector
class IfcHatchLineDistanceSelect:
    def __init__(self, value):
        if not isinstance(value, (IfcPositiveLengthMeasure, IfcVector)):
            raise TypeError("value must be one of: IfcPositiveLengthMeasure, IfcVector")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
