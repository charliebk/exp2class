class IfcSurfaceStyleShading(IfcPresentationItem):
    def __init__(self):
        self.SurfaceColour: IfcColourRgb = None
        self.Transparency: IfcNormalisedRatioMeasure = None

    # === EXTENDED BY ===
    # IfcSurfaceStyleRendering
