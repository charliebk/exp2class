# SELECT TYPE IfcDocumentSelect
# Options:
# - IfcDocumentInformation
# - IfcDocumentReference
class IfcDocumentSelect:
    def __init__(self, value):
        if not isinstance(value, (IfcDocumentInformation, IfcDocumentReference)):
            raise TypeError("value must be one of: IfcDocumentInformation, IfcDocumentReference")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
