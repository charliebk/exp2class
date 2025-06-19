# SELECT TYPE IfcModulusOfSubgradeReactionSelect
# Options:
# - IfcBoolean
# - IfcModulusOfSubgradeReactionMeasure
class IfcModulusOfSubgradeReactionSelect:
    def __init__(self, value):
        if not isinstance(value, (IfcBoolean, IfcModulusOfSubgradeReactionMeasure)):
            raise TypeError("value must be one of: IfcBoolean, IfcModulusOfSubgradeReactionMeasure")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
