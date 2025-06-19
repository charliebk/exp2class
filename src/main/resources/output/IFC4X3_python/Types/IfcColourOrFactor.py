# SELECT TYPE IfcColourOrFactor
# Options:
# - IfcColourRgb
# - IfcNormalisedRatioMeasure
class IfcColourOrFactor:
    def __init__(self, value):
        if not isinstance(value, (IfcColourRgb, IfcNormalisedRatioMeasure)):
            raise TypeError("value must be one of: IfcColourRgb, IfcNormalisedRatioMeasure")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
