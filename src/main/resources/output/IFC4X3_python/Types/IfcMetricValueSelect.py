# SELECT TYPE IfcMetricValueSelect
# Options:
# - IfcAppliedValue
# - IfcMeasureWithUnit
# - IfcReference
# - IfcTable
# - IfcTimeSeries
# - IfcValue
class IfcMetricValueSelect:
    def __init__(self, value):
        if not isinstance(value, (IfcAppliedValue, IfcMeasureWithUnit, IfcReference, IfcTable, IfcTimeSeries, IfcValue)):
            raise TypeError("value must be one of: IfcAppliedValue, IfcMeasureWithUnit, IfcReference, IfcTable, IfcTimeSeries, IfcValue")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
