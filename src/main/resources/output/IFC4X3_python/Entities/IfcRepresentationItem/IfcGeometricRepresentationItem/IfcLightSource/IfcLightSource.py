class IfcLightSource(IfcGeometricRepresentationItem):
    def __init__(self):
        self.Name: IfcLabel = None
        self.LightColour: IfcColourRgb = None
        self.AmbientIntensity: IfcNormalisedRatioMeasure = None
        self.Intensity: IfcNormalisedRatioMeasure = None

    # === EXTENDED BY ===
    # IfcLightSourceAmbient
    # IfcLightSourceDirectional
    # IfcLightSourceGoniometric
    # IfcLightSourcePositional
