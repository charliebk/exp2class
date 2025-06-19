# SELECT TYPE IfcSurfaceStyleElementSelect
# Options:
# - IfcExternallyDefinedSurfaceStyle
# - IfcSurfaceStyleLighting
# - IfcSurfaceStyleRefraction
# - IfcSurfaceStyleShading
# - IfcSurfaceStyleWithTextures
class IfcSurfaceStyleElementSelect:
    def __init__(self, value):
        if not isinstance(value, (IfcExternallyDefinedSurfaceStyle, IfcSurfaceStyleLighting, IfcSurfaceStyleRefraction, IfcSurfaceStyleShading, IfcSurfaceStyleWithTextures)):
            raise TypeError("value must be one of: IfcExternallyDefinedSurfaceStyle, IfcSurfaceStyleLighting, IfcSurfaceStyleRefraction, IfcSurfaceStyleShading, IfcSurfaceStyleWithTextures")
        self.value = value

    def get_value_as(self, cls):
        return cls(self.value) if isinstance(self.value, cls) else None
