# SELECT TYPE IfcVectorOrDirection
# Options:
# - IfcDirection
# - IfcVector
class IfcVectorOrDirection:
    def __init__(self, value):
        if not isinstance(value, (IfcDirection, IfcVector)):
            raise TypeError("value must be one of: IfcDirection, IfcVector")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
