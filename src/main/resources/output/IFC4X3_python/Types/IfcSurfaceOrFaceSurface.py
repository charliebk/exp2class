# SELECT TYPE IfcSurfaceOrFaceSurface
# Options:
# - IfcFaceBasedSurfaceModel
# - IfcFaceSurface
# - IfcSurface
class IfcSurfaceOrFaceSurface:
    def __init__(self, value):
        if not isinstance(value, (IfcFaceBasedSurfaceModel, IfcFaceSurface, IfcSurface)):
            raise TypeError("value must be one of: IfcFaceBasedSurfaceModel, IfcFaceSurface, IfcSurface")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
