# SELECT TYPE IfcProductSelect
# Options:
# - IfcProduct
# - IfcTypeProduct
class IfcProductSelect:
    def __init__(self, value):
        if not isinstance(value, (IfcProduct, IfcTypeProduct)):
            raise TypeError("value must be one of: IfcProduct, IfcTypeProduct")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
