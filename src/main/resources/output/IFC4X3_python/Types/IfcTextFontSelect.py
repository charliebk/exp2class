# SELECT TYPE IfcTextFontSelect
# Options:
# - IfcExternallyDefinedTextFont
# - IfcPreDefinedTextFont
class IfcTextFontSelect:
    def __init__(self, value):
        if not isinstance(value, (IfcExternallyDefinedTextFont, IfcPreDefinedTextFont)):
            raise TypeError("value must be one of: IfcExternallyDefinedTextFont, IfcPreDefinedTextFont")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
