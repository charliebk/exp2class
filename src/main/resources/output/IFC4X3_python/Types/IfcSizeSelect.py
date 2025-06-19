# SELECT TYPE IfcSizeSelect
# Options:
# - IfcDescriptiveMeasure
# - IfcLengthMeasure
# - IfcNormalisedRatioMeasure
# - IfcPositiveLengthMeasure
# - IfcPositiveRatioMeasure
# - IfcRatioMeasure
class IfcSizeSelect:
    def __init__(self, value):
        if not isinstance(value, (IfcDescriptiveMeasure, IfcLengthMeasure, IfcNormalisedRatioMeasure, IfcPositiveLengthMeasure, IfcPositiveRatioMeasure, IfcRatioMeasure)):
            raise TypeError("value must be one of: IfcDescriptiveMeasure, IfcLengthMeasure, IfcNormalisedRatioMeasure, IfcPositiveLengthMeasure, IfcPositiveRatioMeasure, IfcRatioMeasure")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
