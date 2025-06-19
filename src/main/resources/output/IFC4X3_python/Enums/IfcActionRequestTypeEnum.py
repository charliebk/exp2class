from enum import Enum

class IfcActionRequestTypeEnum(Enum):
    EMAIL = "EMAIL"
    FAX = "FAX"
    PHONE = "PHONE"
    POST = "POST"
    VERBAL = "VERBAL"
    USERDEFINED = "USERDEFINED"
    NOTDEFINED = "NOTDEFINED"
