# SELECT TYPE IfcModulusOfTranslationalSubgradeReactionSelect
# Options:
# - IfcBoolean
# - IfcModulusOfLinearSubgradeReactionMeasure
class IfcModulusOfTranslationalSubgradeReactionSelect:
    def __init__(self, value):
        if not isinstance(value, (IfcBoolean, IfcModulusOfLinearSubgradeReactionMeasure)):
            raise TypeError("value must be one of: IfcBoolean, IfcModulusOfLinearSubgradeReactionMeasure")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
