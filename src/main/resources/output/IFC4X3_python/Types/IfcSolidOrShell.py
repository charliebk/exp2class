# SELECT TYPE IfcSolidOrShell
# Options:
# - IfcClosedShell
# - IfcSolidModel
class IfcSolidOrShell:
    def __init__(self, value):
        if not isinstance(value, (IfcClosedShell, IfcSolidModel)):
            raise TypeError("value must be one of: IfcClosedShell, IfcSolidModel")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
