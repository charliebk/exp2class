class IfcRelProjectsElement(IfcRelDecomposes):
    def __init__(self):
        self.RelatingElement: IfcElement = None
        self.RelatedFeatureElement: IfcFeatureElementAddition = None
