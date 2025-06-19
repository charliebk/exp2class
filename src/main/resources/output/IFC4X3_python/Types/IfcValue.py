# SELECT TYPE IfcValue
# Options:
# - IfcDerivedMeasureValue
# - IfcMeasureValue
# - IfcSimpleValue
class IfcValue:
    def __init__(self, value):
        if not isinstance(value, (IfcDerivedMeasureValue, IfcMeasureValue, IfcSimpleValue)):
            raise TypeError("value must be one of: IfcDerivedMeasureValue, IfcMeasureValue, IfcSimpleValue")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
