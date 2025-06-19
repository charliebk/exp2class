# SELECT TYPE IfcClassificationSelect
# Options:
# - IfcClassification
# - IfcClassificationReference
class IfcClassificationSelect:
    def __init__(self, value):
        if not isinstance(value, (IfcClassification, IfcClassificationReference)):
            raise TypeError("value must be one of: IfcClassification, IfcClassificationReference")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
