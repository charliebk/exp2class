from enum import Enum

class IfcVoidingFeatureTypeEnum(Enum):
    CHAMFER = "CHAMFER"
    CUTOUT = "CUTOUT"
    EDGE = "EDGE"
    HOLE = "HOLE"
    MITER = "MITER"
    NOTCH = "NOTCH"
    USERDEFINED = "USERDEFINED"
    NOTDEFINED = "NOTDEFINED"
