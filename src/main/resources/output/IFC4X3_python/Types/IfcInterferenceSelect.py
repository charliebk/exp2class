# SELECT TYPE IfcInterferenceSelect
# Options:
# - IfcElement
# - IfcSpatialElement
class IfcInterferenceSelect:
    def __init__(self, value):
        if not isinstance(value, (IfcElement, IfcSpatialElement)):
            raise TypeError("value must be one of: IfcElement, IfcSpatialElement")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
