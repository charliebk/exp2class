class IfcRelVoidsElement(IfcRelDecomposes):
    def __init__(self):
        self.RelatingBuildingElement: IfcElement = None
        self.RelatedOpeningElement: IfcFeatureElementSubtraction = None
