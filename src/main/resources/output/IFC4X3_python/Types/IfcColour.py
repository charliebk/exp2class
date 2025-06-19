# SELECT TYPE IfcColour
# Options:
# - IfcColourSpecification
# - IfcPreDefinedColour
class IfcColour:
    def __init__(self, value):
        if not isinstance(value, (IfcColourSpecification, IfcPreDefinedColour)):
            raise TypeError("value must be one of: IfcColourSpecification, IfcPreDefinedColour")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
