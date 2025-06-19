# SELECT TYPE IfcTimeOrRatioSelect
# Options:
# - IfcDuration
# - IfcRatioMeasure
class IfcTimeOrRatioSelect:
    def __init__(self, value):
        if not isinstance(value, (IfcDuration, IfcRatioMeasure)):
            raise TypeError("value must be one of: IfcDuration, IfcRatioMeasure")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
