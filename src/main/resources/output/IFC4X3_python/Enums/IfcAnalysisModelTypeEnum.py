from enum import Enum

class IfcAnalysisModelTypeEnum(Enum):
    IN_PLANE_LOADING_2D = "IN_PLANE_LOADING_2D"
    LOADING_3D = "LOADING_3D"
    OUT_PLANE_LOADING_2D = "OUT_PLANE_LOADING_2D"
    USERDEFINED = "USERDEFINED"
    NOTDEFINED = "NOTDEFINED"
