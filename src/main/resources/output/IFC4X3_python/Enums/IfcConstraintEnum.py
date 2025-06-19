from enum import Enum

class IfcConstraintEnum(Enum):
    ADVISORY = "ADVISORY"
    HARD = "HARD"
    SOFT = "SOFT"
    USERDEFINED = "USERDEFINED"
    NOTDEFINED = "NOTDEFINED"
