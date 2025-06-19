# SELECT TYPE IfcModulusOfRotationalSubgradeReactionSelect
# Options:
# - IfcBoolean
# - IfcModulusOfRotationalSubgradeReactionMeasure
class IfcModulusOfRotationalSubgradeReactionSelect:
    def __init__(self, value):
        if not isinstance(value, (IfcBoolean, IfcModulusOfRotationalSubgradeReactionMeasure)):
            raise TypeError("value must be one of: IfcBoolean, IfcModulusOfRotationalSubgradeReactionMeasure")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
