# SELECT TYPE IfcProcessSelect
# Options:
# - IfcProcess
# - IfcTypeProcess
class IfcProcessSelect:
    def __init__(self, value):
        if not isinstance(value, (IfcProcess, IfcTypeProcess)):
            raise TypeError("value must be one of: IfcProcess, IfcTypeProcess")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
