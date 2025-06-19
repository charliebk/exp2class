class IfcRelFillsElement(IfcRelConnects):
    def __init__(self):
        self.RelatingOpeningElement: IfcOpeningElement = None
        self.RelatedBuildingElement: IfcElement = None
