from enum import Enum

class IfcChangeActionEnum(Enum):
    ADDED = "ADDED"
    DELETED = "DELETED"
    MODIFIED = "MODIFIED"
    NOCHANGE = "NOCHANGE"
    NOTDEFINED = "NOTDEFINED"
