from enum import Enum

class IfcFootingTypeEnum(Enum):
    CAISSON_FOUNDATION = "CAISSON_FOUNDATION"
    FOOTING_BEAM = "FOOTING_BEAM"
    PAD_FOOTING = "PAD_FOOTING"
    PILE_CAP = "PILE_CAP"
    STRIP_FOOTING = "STRIP_FOOTING"
    USERDEFINED = "USERDEFINED"
    NOTDEFINED = "NOTDEFINED"
