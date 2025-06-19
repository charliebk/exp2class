# SELECT TYPE IfcFillStyleSelect
# Options:
# - IfcColour
# - IfcExternallyDefinedHatchStyle
# - IfcFillAreaStyleHatching
# - IfcFillAreaStyleTiles
class IfcFillStyleSelect:
    def __init__(self, value):
        if not isinstance(value, (IfcColour, IfcExternallyDefinedHatchStyle, IfcFillAreaStyleHatching, IfcFillAreaStyleTiles)):
            raise TypeError("value must be one of: IfcColour, IfcExternallyDefinedHatchStyle, IfcFillAreaStyleHatching, IfcFillAreaStyleTiles")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
