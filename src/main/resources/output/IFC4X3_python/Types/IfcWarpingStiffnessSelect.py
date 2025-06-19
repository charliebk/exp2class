# SELECT TYPE IfcWarpingStiffnessSelect
# Options:
# - IfcBoolean
# - IfcWarpingMomentMeasure
class IfcWarpingStiffnessSelect:
    def __init__(self, value):
        if not isinstance(value, (IfcBoolean, IfcWarpingMomentMeasure)):
            raise TypeError("value must be one of: IfcBoolean, IfcWarpingMomentMeasure")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
