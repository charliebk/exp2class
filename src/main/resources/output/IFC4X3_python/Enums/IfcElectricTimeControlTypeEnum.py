from enum import Enum

class IfcElectricTimeControlTypeEnum(Enum):
    RELAY = "RELAY"
    TIMECLOCK = "TIMECLOCK"
    TIMEDELAY = "TIMEDELAY"
    USERDEFINED = "USERDEFINED"
    NOTDEFINED = "NOTDEFINED"
