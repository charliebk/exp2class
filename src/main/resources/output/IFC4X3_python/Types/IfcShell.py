# SELECT TYPE IfcShell
# Options:
# - IfcClosedShell
# - IfcOpenShell
class IfcShell:
    def __init__(self, value):
        if not isinstance(value, (IfcClosedShell, IfcOpenShell)):
            raise TypeError("value must be one of: IfcClosedShell, IfcOpenShell")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
