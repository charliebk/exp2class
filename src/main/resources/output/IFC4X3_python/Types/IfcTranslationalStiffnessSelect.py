# SELECT TYPE IfcTranslationalStiffnessSelect
# Options:
# - IfcBoolean
# - IfcLinearStiffnessMeasure
class IfcTranslationalStiffnessSelect:
    def __init__(self, value):
        if not isinstance(value, (IfcBoolean, IfcLinearStiffnessMeasure)):
            raise TypeError("value must be one of: IfcBoolean, IfcLinearStiffnessMeasure")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
