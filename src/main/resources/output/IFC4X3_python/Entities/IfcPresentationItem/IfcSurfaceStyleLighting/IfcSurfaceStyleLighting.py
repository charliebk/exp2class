class IfcSurfaceStyleLighting(IfcPresentationItem):
    def __init__(self):
        self.DiffuseTransmissionColour: IfcColourRgb = None
        self.DiffuseReflectionColour: IfcColourRgb = None
        self.TransmissionColour: IfcColourRgb = None
        self.ReflectanceColour: IfcColourRgb = None
