from enum import Enum

class IfcDocumentConfidentialityEnum(Enum):
    CONFIDENTIAL = "CONFIDENTIAL"
    PERSONAL = "PERSONAL"
    PUBLIC = "PUBLIC"
    RESTRICTED = "RESTRICTED"
    USERDEFINED = "USERDEFINED"
    NOTDEFINED = "NOTDEFINED"
