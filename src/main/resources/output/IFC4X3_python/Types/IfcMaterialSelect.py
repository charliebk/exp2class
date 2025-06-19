# SELECT TYPE IfcMaterialSelect
# Options:
# - IfcMaterialDefinition
# - IfcMaterialList
# - IfcMaterialUsageDefinition
class IfcMaterialSelect:
    def __init__(self, value):
        if not isinstance(value, (IfcMaterialDefinition, IfcMaterialList, IfcMaterialUsageDefinition)):
            raise TypeError("value must be one of: IfcMaterialDefinition, IfcMaterialList, IfcMaterialUsageDefinition")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
