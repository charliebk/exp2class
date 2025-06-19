# SELECT TYPE IfcAppliedValueSelect
# Options:
# - IfcMeasureWithUnit
# - IfcReference
# - IfcValue
class IfcAppliedValueSelect:
    def __init__(self, value):
        if not isinstance(value, (IfcMeasureWithUnit, IfcReference, IfcValue)):
            raise TypeError("value must be one of: IfcMeasureWithUnit, IfcReference, IfcValue")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
