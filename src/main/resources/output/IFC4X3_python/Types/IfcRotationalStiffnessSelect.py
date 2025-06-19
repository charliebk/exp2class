# SELECT TYPE IfcRotationalStiffnessSelect
# Options:
# - IfcBoolean
# - IfcRotationalStiffnessMeasure
class IfcRotationalStiffnessSelect:
    def __init__(self, value):
        if not isinstance(value, (IfcBoolean, IfcRotationalStiffnessMeasure)):
            raise TypeError("value must be one of: IfcBoolean, IfcRotationalStiffnessMeasure")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
