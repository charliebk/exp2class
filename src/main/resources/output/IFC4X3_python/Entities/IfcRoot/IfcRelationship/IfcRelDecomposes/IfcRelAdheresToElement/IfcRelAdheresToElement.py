class IfcRelAdheresToElement(IfcRelDecomposes):
    def __init__(self):
        self.RelatingElement: IfcElement = None
        self.RelatedSurfaceFeatures: SET [1:?] OF IfcSurfaceFeature = None
