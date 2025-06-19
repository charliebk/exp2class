# SELECT TYPE IfcSpecularHighlightSelect
# Options:
# - IfcSpecularExponent
# - IfcSpecularRoughness
class IfcSpecularHighlightSelect:
    def __init__(self, value):
        if not isinstance(value, (IfcSpecularExponent, IfcSpecularRoughness)):
            raise TypeError("value must be one of: IfcSpecularExponent, IfcSpecularRoughness")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
