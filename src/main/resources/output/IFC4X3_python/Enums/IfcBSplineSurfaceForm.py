from enum import Enum

class IfcBSplineSurfaceForm(Enum):
    CONICAL_SURF = "CONICAL_SURF"
    CYLINDRICAL_SURF = "CYLINDRICAL_SURF"
    GENERALISED_CONE = "GENERALISED_CONE"
    PLANE_SURF = "PLANE_SURF"
    QUADRIC_SURF = "QUADRIC_SURF"
    RULED_SURF = "RULED_SURF"
    SPHERICAL_SURF = "SPHERICAL_SURF"
    SURF_OF_LINEAR_EXTRUSION = "SURF_OF_LINEAR_EXTRUSION"
    SURF_OF_REVOLUTION = "SURF_OF_REVOLUTION"
    TOROIDAL_SURF = "TOROIDAL_SURF"
    UNSPECIFIED = "UNSPECIFIED"
