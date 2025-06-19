# SELECT TYPE IfcUnit
# Options:
# - IfcDerivedUnit
# - IfcMonetaryUnit
# - IfcNamedUnit
class IfcUnit:
    def __init__(self, value):
        if not isinstance(value, (IfcDerivedUnit, IfcMonetaryUnit, IfcNamedUnit)):
            raise TypeError("value must be one of: IfcDerivedUnit, IfcMonetaryUnit, IfcNamedUnit")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
