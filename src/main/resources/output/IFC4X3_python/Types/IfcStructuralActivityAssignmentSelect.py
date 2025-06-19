# SELECT TYPE IfcStructuralActivityAssignmentSelect
# Options:
# - IfcElement
# - IfcStructuralItem
class IfcStructuralActivityAssignmentSelect:
    def __init__(self, value):
        if not isinstance(value, (IfcElement, IfcStructuralItem)):
            raise TypeError("value must be one of: IfcElement, IfcStructuralItem")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
