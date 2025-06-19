class IfcSurfaceStyleRendering(IfcSurfaceStyleShading):
    def __init__(self):
        self.DiffuseColour: IfcColourOrFactor = None
        self.TransmissionColour: IfcColourOrFactor = None
        self.DiffuseTransmissionColour: IfcColourOrFactor = None
        self.ReflectionColour: IfcColourOrFactor = None
        self.SpecularColour: IfcColourOrFactor = None
        self.SpecularHighlight: IfcSpecularHighlightSelect = None
        self.ReflectanceMethod: IfcReflectanceMethodEnum = None
