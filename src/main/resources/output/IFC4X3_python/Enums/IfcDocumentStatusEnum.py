from enum import Enum

class IfcDocumentStatusEnum(Enum):
    DRAFT = "DRAFT"
    FINAL = "FINAL"
    FINALDRAFT = "FINALDRAFT"
    REVISION = "REVISION"
    NOTDEFINED = "NOTDEFINED"
