class IfcRelConnectsPortToElement(IfcRelConnects):
    def __init__(self):
        self.RelatingPort: IfcPort = None
        self.RelatedElement: IfcDistributionElement = None
