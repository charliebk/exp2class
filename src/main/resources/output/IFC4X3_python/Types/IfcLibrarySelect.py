# SELECT TYPE IfcLibrarySelect
# Options:
# - IfcLibraryInformation
# - IfcLibraryReference
class IfcLibrarySelect:
    def __init__(self, value):
        if not isinstance(value, (IfcLibraryInformation, IfcLibraryReference)):
            raise TypeError("value must be one of: IfcLibraryInformation, IfcLibraryReference")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
