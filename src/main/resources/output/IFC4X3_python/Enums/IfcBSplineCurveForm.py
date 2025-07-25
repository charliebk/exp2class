from enum import Enum

class IfcBSplineCurveForm(Enum):
    CIRCULAR_ARC = "CIRCULAR_ARC"
    ELLIPTIC_ARC = "ELLIPTIC_ARC"
    HYPERBOLIC_ARC = "HYPERBOLIC_ARC"
    PARABOLIC_ARC = "PARABOLIC_ARC"
    POLYLINE_FORM = "POLYLINE_FORM"
    UNSPECIFIED = "UNSPECIFIED"
