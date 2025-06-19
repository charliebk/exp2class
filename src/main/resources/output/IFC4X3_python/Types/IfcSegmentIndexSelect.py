# SELECT TYPE IfcSegmentIndexSelect
# Options:
# - IfcArcIndex
# - IfcLineIndex
class IfcSegmentIndexSelect:
    def __init__(self, value):
        if not isinstance(value, (IfcArcIndex, IfcLineIndex)):
            raise TypeError("value must be one of: IfcArcIndex, IfcLineIndex")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
